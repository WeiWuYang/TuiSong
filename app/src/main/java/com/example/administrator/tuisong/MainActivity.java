package com.example.administrator.tuisong;

import android.app.Notification;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.jpush.android.api.BasicPushNotificationBuilder;
import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /***
         *  745ffb2ec67c2ce38e085bbd
         */
        BasicPushNotificationBuilder builder = new BasicPushNotificationBuilder(MainActivity.this);
        builder.statusBarDrawable = R.drawable.jpush_richpush_btn_selector;
        builder.notificationFlags = Notification.FLAG_AUTO_CANCEL
                | Notification.FLAG_SHOW_LIGHTS;  //设置为自动消失和呼吸灯闪烁
        builder.notificationDefaults = Notification.DEFAULT_SOUND
                | Notification.DEFAULT_VIBRATE
                | Notification.DEFAULT_LIGHTS;  // 设置为铃声、震动、呼吸灯闪烁都要
        JPushInterface.setPushNotificationBuilder(1, builder);
    }
}
