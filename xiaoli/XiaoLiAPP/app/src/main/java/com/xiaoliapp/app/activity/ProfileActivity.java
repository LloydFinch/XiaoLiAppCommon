package com.xiaoliapp.app.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.constants.Constants;

public class ProfileActivity extends BaseActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
		RadioButton radioButton = (RadioButton) this.findViewById(R.id.bottom_tab_profile);
		radioButton.setChecked(true);
	}

	protected void init() {

		super.setTitle("我");
		super.setCancel(false);
		super.setBack(false);

		RelativeLayout l = (RelativeLayout) findViewById(R.id.base_block_top);
		l.setBackgroundColor(Color.parseColor("#df1135"));

		RelativeLayout content = (RelativeLayout) findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_profile_content, content);
	}

	public void onCheckedChanged(RadioGroup group, int checkedId) {
		Intent intent = new Intent();
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

		switch (checkedId) {

			//底部Activity的跳转
			case R.id.bottom_tab_relation:
				intent.setAction("com.xiaoli.activity.RelationActivity");
				break;
			case R.id.bottom_tab_guide:
				intent.setAction("com.xiaoli.activity.GuideActivity");
				break;
			case R.id.bottom_tab_discover:
				intent.setAction("com.xiaoli.activity.DiscoverActivity");
				break;
			default:
				break;
		}
		if (intent.getAction() != null) {
			startActivity(intent);
		}
	}

	boolean exit = false;

	public void onBackPressed() {
		if (!exit) {
			Toast.makeText(this, "连按此项以退出", Toast.LENGTH_SHORT).show();
		} else {
			super.onBackPressed();
		}
		exit = true;
	}
}
