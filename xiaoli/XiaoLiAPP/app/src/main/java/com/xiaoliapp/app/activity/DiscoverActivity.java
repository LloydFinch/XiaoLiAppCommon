package com.xiaoliapp.app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import com.xiaoliapp.app.R;

public class DiscoverActivity extends BaseActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
		RadioButton radioButton = (RadioButton) this.findViewById(R.id.bottom_tab_discover);
		radioButton.setChecked(true);
	}

	protected void init() {
		RelativeLayout content = (RelativeLayout) findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_discover_content, content);
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
			case R.id.bottom_tab_profile:
				intent.setAction("com.xiaoli.activity.ProfileActivity");
				break;
			default:
				break;
		}
		if (intent.getAction() != null) {
			startActivity(intent);
		}
	}

	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
			case R.id.activity_discover_block_photo:
				//TODO 缺少跳转到相册页面
				intent = new Intent();
				intent.setType("image/*");
				intent.setAction(Intent.ACTION_GET_CONTENT);
				break;
			case R.id.activity_discover_block_gift_warn:
				intent = new Intent(this, GiftsWarnActivity.class);
				break;
			case R.id.activity_discover_block_sms:
				//TODO 缺少跳转到短信模板
				break;
			case R.id.activity_discover_block_scan:
				//TODO 缺少扫一扫
				break;
			case R.id.activity_discover_block_my_card:
				//TODO 卡券问题的复用
				intent = new Intent(this, MyCardActivity.class);
				break;
			case R.id.activity_discover_block_care_topic:
				intent = new Intent(this, RecommendPlanActivity.class);
				break;
			default:
				break;
		}
		if (intent != null) {
			startActivity(intent);
		}
	}
}
