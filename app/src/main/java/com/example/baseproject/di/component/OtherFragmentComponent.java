package com.example.baseproject.di.component;

import com.example.baseproject.di.module.OtherFragmentModule;
import com.example.baseproject.di.scope.FragmentScope;
import com.example.baseproject.module.other.OtherFragment;

import dagger.Component;

/**
 * Created by chenxz on 2017/12/3.
 */
@FragmentScope
@Component(dependencies = AppComponent.class, modules = OtherFragmentModule.class)
public interface OtherFragmentComponent {
    void inject(OtherFragment fragment);
}
