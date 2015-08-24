package com.xiaoliapp.app.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;

public class BundleMailActivity extends BaseActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}

	protected void init() {
		super.setTitle("绑定邮箱");
		super.setCancel(false);
		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_bundle_mail, content);
	}
}
