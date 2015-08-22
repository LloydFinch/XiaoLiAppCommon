package com.xiaoliapp.app.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;

/**
 * “发现”---“群发消息”界面，用来发送短信，可以选择短信模板
 */
public class GroupSendNextActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();

	}

	protected void init() {
		super.setTitle("选择收件人");
		super.setCancel(false);

		RelativeLayout l = (RelativeLayout) findViewById(R.id.base_block_top);
		l.setBackgroundColor(Color.parseColor("#df1135"));


		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_group_next_content, content);


		CheckBox checkBox = (CheckBox) content.findViewById(R.id.discover_groupnext_settime);
		checkBox.setOnCheckedChangeListener(this);
	}

	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked) {
			Intent intent = new Intent(this, SettingTimeActivity.class);
			this.startActivity(intent);
		}
	}
}
