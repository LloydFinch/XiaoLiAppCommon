package com.xiaoliapp.app.activity;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.constants.Constants;


//搜索的Activity用于执行搜索并将结果返回给发起检索的Activity
public class SearchActivity extends FragmentActivity implements View.OnClickListener {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
	}

	public void onClick(View view) {
		Intent intent = getIntent();
		switch (view.getId()) {
			case R.id.activity_search_btn_search:
				//TODO 执行搜索功能,并且将搜索结果保存在intent中
				setResult(Constants.CODE_ACTIVITY_SEARCH, intent);
				break;
			case R.id.activity_search_btn_back:
				finish();
				break;
			default:
				break;
		}
	}
}
