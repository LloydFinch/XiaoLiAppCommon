package com.xiaoliapp.app.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;

public class SettingNotifyActivity extends BaseActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting_notify);
	}

	protected void init() {
		super.setTitle("通知设置");
		super.setCancel(false);
		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_setting_notify, content);
	}
}
