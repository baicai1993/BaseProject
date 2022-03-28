package com.example.baseproject.di.module;

import com.example.baseproject.di.scope.FragmentScope;
import com.example.baseproject.module.other.OtherContract;
import com.example.baseproject.module.other.OtherModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chenxz on 2017/12/3.
 */
@Module
public class OtherFragmentModule {

    private OtherContract.View view;

    public OtherFragmentModule(OtherContract.View view) {
        this.view = view;
    }

    @FragmentScope
    @Provides
    OtherContract.View provideOtherView() {
        return this.view;
    }

    @FragmentScope
    @Provides
    OtherContract.Model provideOtherModel(OtherModel model) {
        return model;
    }

}
