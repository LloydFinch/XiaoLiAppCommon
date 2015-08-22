package com.xiaoliapp.app.activity;

import android.os.Bundle;

import android.widget.ListView;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.adapter.ImpressAdapter;
import com.xiaoliapp.app.entity.MyImpress;

import java.util.ArrayList;
import java.util.List;


public class ImpressActivity extends BaseActivity {
    private ListView listView;
    private List<MyImpress> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impress_content);
        init();
        listView = (ListView) findViewById(R.id.impress_listView);
        initDatas();
        ImpressAdapter adapter = new ImpressAdapter(this,list);
        listView.setAdapter(adapter);
    }

    @Override
    protected void init() {
        super.setTitle("阿三");
        super.setCancel(false);
    }

    public void initDatas(){
        list = new ArrayList<MyImpress>();
        for (int i = 0; i < 3; i++) {
            MyImpress impress = new MyImpress();
            impress.setCai("27");
            impress.setZan("36");
            impress.setDate("6-7");
            impress.setNick("大寻求");
            list.add(impress);
        }
    }

}
