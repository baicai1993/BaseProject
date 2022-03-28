package com.example.baseproject.http.service;


import com.example.baseproject.bean.WeatherInfo;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by chenxz on 2017/11/30.
 */
public interface RetrofitService {

    @GET("adat/sk/{cityId}.html")
    Flowable<WeatherInfo> getWeatherInfo(@Path("cityId") String cityId);

    @GET("adat/sk/{cityId}.html")
    Flowable<WeatherInfo> getWeatherInfoWitchCache(@Path("cityId") String cityId);

}
