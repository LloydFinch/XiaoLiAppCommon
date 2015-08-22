package com.xiaoliapp.app.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;

public class ForgetPSWActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    @Override
    protected void init() {
        super.setTitle("忘记密码");
        super.setCancel(false);
        RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
        LayoutInflater.from(this).inflate(R.layout.activity_forget_psw_content, content);
        super.setBottomBar(false);
    }


}
