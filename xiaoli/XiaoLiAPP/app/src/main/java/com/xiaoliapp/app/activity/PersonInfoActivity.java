package com.xiaoliapp.app.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;

/**
 * 页面32----我的个人信息
 */
public class PersonInfoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       init();
    }

    @Override
    protected void init() {
        super.setTitle("个人信息");
        super.setCancel(false);

        RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
        LayoutInflater.from(this).inflate(R.layout.activity_personinfo_content, content);
    }


}
