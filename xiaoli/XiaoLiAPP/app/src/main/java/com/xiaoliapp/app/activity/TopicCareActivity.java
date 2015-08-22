package com.xiaoliapp.app.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.adapter.TopicCareAdapter;
import com.xiaoliapp.app.entity.TopicCare;

import java.util.ArrayList;
import java.util.List;


/**
 * 关怀话题---精品关怀
 *
 * 点击--------跳转：关怀话题详情页
 *
 */
public class TopicCareActivity extends ActionBarActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

    private ListView listView;
    private List<TopicCare> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_care);

        listView = (ListView)findViewById(R.id.topic_care_listView);

        list = new ArrayList<TopicCare>();
        if(list!=null){
            for (int i = 0; i < 3; i++) {
                TopicCare care = new TopicCare();
                care.setDetails("为了迎接抗战胜利70周年阅兵活动，北京市对长安街复兴门至建国门之间的");
                care.setImage(R.mipmap
                        .topic_care);
                list.add(care);
            }
        }
        TopicCareAdapter adapter = new TopicCareAdapter(this,list);
        listView.setAdapter(adapter);
        listView.setFastScrollEnabled(false);
        listView.setOnItemClickListener(this);
    }


    //TODO Item的点击事件,点击跳转到页面30，关怀话题详情页
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}




































































