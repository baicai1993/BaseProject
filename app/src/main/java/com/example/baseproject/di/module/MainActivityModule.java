package com.example.baseproject.di.module;

import com.example.baseproject.di.scope.ActivityScope;
import com.example.baseproject.module.main.MainContract;
import com.example.baseproject.module.main.MainModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chenxz on 2017/12/2.
 */
@Module
public class MainActivityModule {

    private MainContract.View view;

    public MainActivityModule(MainContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MainContract.View provideMainView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MainContract.Model provideMainModel(MainModel model) {
        return model;
    }

}
