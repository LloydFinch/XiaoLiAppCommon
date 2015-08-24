package com.xiaoliapp.app.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;

public class ChangeSettingActivity extends BaseActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}

	protected void init() {
		super.setTitle("更改手机设置");
		super.setCancel(false);
		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_change_setting, content);
	}
}
