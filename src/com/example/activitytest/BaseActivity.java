package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d("BaseActivity", getClass().getSimpleName());
		ActivityCollector.addActivity(this);
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
}
