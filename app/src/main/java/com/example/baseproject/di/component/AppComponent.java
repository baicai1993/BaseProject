package com.example.baseproject.di.component;


import com.example.baseproject.app.App;
import com.example.baseproject.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by chenxz on 2017/12/2.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    App getContext();

}
