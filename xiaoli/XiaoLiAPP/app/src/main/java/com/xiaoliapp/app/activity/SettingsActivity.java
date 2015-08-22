package com.xiaoliapp.app.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaoliapp.app.R;

/**
 * “我的”---“设置”页面
 */
public class SettingsActivity extends BaseActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();

    }

    protected void init() {
        super.setTitle("设置");
        TextView cancel = (TextView) findViewById(R.id.base_top_title);
        cancel.setText("编辑");
        RelativeLayout l = (RelativeLayout) findViewById(R.id.base_block_top);
        l.setBackgroundColor(Color.parseColor("#df1135"));

        RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
        content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_settings_content, content);
    }
}
