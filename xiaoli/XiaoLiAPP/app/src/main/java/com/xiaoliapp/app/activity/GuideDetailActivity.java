package com.xiaoliapp.app.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;


/**
 * 20-情礼攻略内容详情页
 */
public class GuideDetailActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide_detail_content);
	}

	@Override
	protected void init() {
		super.setTitle("相关标题");
		super.setCancel(false);

		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		LayoutInflater.from(this).inflate(R.layout.activity_guide_detail_content, content);
	}
}
