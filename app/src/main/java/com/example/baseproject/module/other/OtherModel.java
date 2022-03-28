package com.example.baseproject.module.other;


import com.example.baseproject.base.mvp.BaseModel;
import com.example.baseproject.di.scope.FragmentScope;

import javax.inject.Inject;

/**
 * Created by chenxz on 2017/12/3.
 */
@FragmentScope
public class OtherModel extends BaseModel implements OtherContract.Model {

    @Inject
    public OtherModel() {
    }

}
