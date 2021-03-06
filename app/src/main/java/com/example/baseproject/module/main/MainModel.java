package com.example.baseproject.module.main;

import com.example.baseproject.base.mvp.BaseModel;
import com.example.baseproject.bean.WeatherInfo;
import com.example.baseproject.di.scope.ActivityScope;
import com.example.baseproject.http.HostType;
import com.example.baseproject.http.RetrofitHelper;
import com.example.baseproject.http.RetrofitManager;
import com.example.baseproject.http.cache.CacheProvider;
import com.example.baseproject.http.service.RetrofitService;

import org.reactivestreams.Publisher;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictDynamicKey;
import io.rx_cache2.Reply;

/**
 * Created by chenxz on 2017/12/2.
 */
@ActivityScope
public class MainModel extends BaseModel implements MainContract.Model {

    private RetrofitHelper mRetrofitHelper;

    @Inject
    public MainModel() {
        mRetrofitHelper = RetrofitHelper.getInstance();
    }

    @Override
    public Flowable<WeatherInfo> loadWeatherData(String cityId) {
        return RetrofitManager.getInstance(HostType.WEATHER_INFO).getWeatherInfoObservable(cityId);
    }

    @Override
    public Flowable<WeatherInfo> loadWeatherData(final String cityId, final boolean isUpdate) {

        return Flowable.just(mRetrofitHelper.obtainRetrofitService(RetrofitService.class).getWeatherInfoWitchCache(cityId))
                .flatMap(new Function<Flowable<WeatherInfo>, Publisher<WeatherInfo>>() {
                    @Override
                    public Publisher<WeatherInfo> apply(Flowable<WeatherInfo> weatherInfoFlowable) throws Exception {
                        return mRetrofitHelper.obtainCacheService(CacheProvider.class)
                                .getWeatherWithCache(weatherInfoFlowable, new DynamicKey(cityId), new EvictDynamicKey(isUpdate))
                                .map(new Function<Reply<WeatherInfo>, WeatherInfo>() {
                                    @Override
                                    public WeatherInfo apply(Reply<WeatherInfo> weatherInfoReply) throws Exception {
                                        return weatherInfoReply.getData();
                                    }
                                });
                    }
                });
    }
}
