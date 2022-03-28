package com.example.baseproject.di.component;


import com.example.baseproject.di.module.MainActivityModule;
import com.example.baseproject.di.scope.ActivityScope;
import com.example.baseproject.module.main.MainActivity;

import dagger.Component;

/**
 * Created by chenxz on 2017/12/2.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
