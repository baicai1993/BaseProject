package com.example.baseproject.module.main;


import com.example.baseproject.base.mvp.IModel;
import com.example.baseproject.base.mvp.IPresenter;
import com.example.baseproject.base.mvp.IView;
import com.example.baseproject.bean.WeatherInfo;
import com.example.baseproject.event.MessageEvent;

import io.reactivex.Flowable;

/**
 * Created by chenxz on 2017/12/2.
 */

public interface MainContract {

    interface View extends IView {
        void updateWeather(WeatherInfo weatherInfo);

        void setMessage(MessageEvent messageEvent);
    }

    interface Presenter extends IPresenter {
        void loadWeatherData(String cityId);
    }

    interface Model extends IModel {
        Flowable<WeatherInfo> loadWeatherData(String cityId);

        Flowable<WeatherInfo> loadWeatherData(String cityId, boolean isUpdate);
    }

}
