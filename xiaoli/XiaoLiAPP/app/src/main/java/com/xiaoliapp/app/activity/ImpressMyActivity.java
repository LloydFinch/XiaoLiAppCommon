package com.xiaoliapp.app.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.adapter.GuideImpressMyAdapter;

/**
 * “情礼攻略”---“我的印象”页面
 */
public class ImpressMyActivity extends BaseActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();

	}

	protected void init() {
		super.setTitle("阿三");
		super.setBack(false);
		super.setCancel(false);

		RelativeLayout l = (RelativeLayout) findViewById(R.id.base_block_top);
		l.setBackgroundColor(Color.parseColor("#df1135"));

		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_impress_my_content, content);

		ListView listview = (ListView) content.findViewById(R.id.guide_impress_my_listview);
		GuideImpressMyAdapter adapter = new GuideImpressMyAdapter(this);
		listview.setAdapter(adapter);
	}
}
