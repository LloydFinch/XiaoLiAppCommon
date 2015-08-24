package com.xiaoliapp.app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.adapter.RecommendPlanListViewAdapter;
import com.xiaoliapp.app.constants.Constants;

public class RecommendPlanActivity extends BaseActivity implements View.OnClickListener, AdapterView
		.OnItemClickListener {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}

	protected void init() {
		super.setTitle("推荐方案");
		super.setCancel(false);
		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_recommend_plan_content,
				content);
		ListView contentList = (ListView) content.findViewById(R.id.activity_recommend_plan_list);
		RecommendPlanListViewAdapter adapter = new RecommendPlanListViewAdapter(this);
		contentList.setAdapter(adapter);
		contentList.setOnItemClickListener(this);
	}

	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.base_top_back:
				super.onBackPressed();
				break;
		}
	}

	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		//TODO 需要传送数据到送礼界面
		Intent intent = getIntent();
		setResult(Constants.CODE_ACTIVITY_RECOMPLAN, intent);
		finish();
	}
}
