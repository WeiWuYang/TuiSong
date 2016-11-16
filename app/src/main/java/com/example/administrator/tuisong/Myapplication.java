package com.example.administrator.tuisong;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2016/11/15.
 */

public class Myapplication extends Application {
    @Override
    public void onCreate() {
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
