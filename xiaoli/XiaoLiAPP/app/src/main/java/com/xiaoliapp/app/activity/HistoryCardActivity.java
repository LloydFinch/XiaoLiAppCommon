package com.xiaoliapp.app.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;

/**
 * “情礼攻略”---“我的印象”界面
 */
public class HistoryCardActivity extends BaseActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}

	protected void init() {
		super.setTitle("可用卡券");
		super.setCancel(false);

		RelativeLayout l = (RelativeLayout) findViewById(R.id.base_block_top);
		l.setBackgroundColor(Color.parseColor("#df1135"));

		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_history_card_content, content);

		//TODO content既为内容区
	}
}
