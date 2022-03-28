package com.example.baseproject.base.mvp;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Created by chenxz on 2017/11/30.
 */

public class BaseModel implements IModel, LifecycleObserver {

    protected final String TAG = this.getClass().getSimpleName();

    @Override
    public void onDestroy() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(LifecycleOwner owner) {
        Log.e(TAG, "onDestroy: LifecycleOwner");
        owner.getLifecycle().removeObserver(this);
    }

}
