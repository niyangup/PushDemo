package com.example.pushdemo.receiver;

import android.content.Context;
import cn.jpush.android.service.WakedResultReceiver;

public class MyWakedResultReceiver extends WakedResultReceiver {
	@Override
	public void onWake(Context context, int wakeType) {
		super.onWake(context, wakeType);
	}
	
	@Override
	public void onWake(int wakeType) {
		super.onWake(wakeType);
	}
	
}
