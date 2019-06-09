package com.example.pushdemo;

import android.app.Application;
import cn.jpush.android.api.JPushInterface;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		JPushInterface.setDebugMode(true);
		JPushInterface.init(this);
	}
}