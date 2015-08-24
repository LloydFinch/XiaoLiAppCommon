package com.xiaoliapp.app.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;

public class SecureSettingActivity extends BaseActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}

	protected void init() {
		super.setTitle("安全设置");
		super.setCancel("编辑");
		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_secure_setting, content);
	}
}
