package com.example.baseproject.module.other;

import com.example.baseproject.base.mvp.IModel;
import com.example.baseproject.base.mvp.IPresenter;
import com.example.baseproject.base.mvp.IView;
import com.example.baseproject.event.MessageEvent;

/**
 * Created by chenxz on 2017/12/3.
 */

public interface OtherContract {

    interface View extends IView {
        void setMessage(MessageEvent messageEvent);
    }

    interface Model extends IModel {

    }

    interface Presenter extends IPresenter {
        void sendMessage();
    }

}
