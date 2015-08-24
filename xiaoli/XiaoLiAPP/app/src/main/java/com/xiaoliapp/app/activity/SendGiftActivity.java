package com.xiaoliapp.app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.constants.Constants;

public class SendGiftActivity extends BaseActivity implements OnClickListener {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}

	protected void init() {
		//TODO 根据传递的Intent中的数据设置标题
		super.setTitle("给 阿三 送礼");
		super.setCancel(false);

		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_send_gift_content, content);
	}

	public void onClick(View v) {

		Intent intent = null;
		switch (v.getId()) {
			case R.id.base_top_back:
				super.onBackPressed();
				break;
			case R.id.activity_send_give_impress:
				intent = new Intent(this, ImpressActivity.class);
				break;
			case R.id.activity_send_line1:
				intent = new Intent(this, RecommendPlanActivity.class);
				break;
			case R.id.activity_send_line2:
				//TODO 缺少祝福语模板
				break;
			case R.id.activity_send_line3:
				intent = new Intent(this, MyCardActivity.class);
				break;
			case R.id.activity_send_btn_send:
				break;
		}
		if (intent != null) {
			startActivityForResult(intent, Constants.CODE_ACTIVITY_SENDGIFT);
		}
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode == Constants.CODE_ACTIVITY_SENDGIFT){
			switch (resultCode){
				//TODO 对不同的Activity的不同返回码进行处理
			}
		}
	}
}
