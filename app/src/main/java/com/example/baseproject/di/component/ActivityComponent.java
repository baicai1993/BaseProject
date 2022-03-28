package com.example.baseproject.di.component;


import com.example.baseproject.di.module.ActivityModule;
import com.example.baseproject.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by chenxz on 2017/12/2.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

//    Activity getActivity();

//    void inject(MainActivity mainActivity);

}
