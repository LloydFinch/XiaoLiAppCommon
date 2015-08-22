package com.xiaoliapp.app.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.adapter.MyCardAdapter;
import com.xiaoliapp.app.entity.Card;

import java.util.ArrayList;
import java.util.List;


/**
 * 我的卡券页面
 */

public class MyCardActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_mycard_content);


        ListView listView = (ListView)findViewById(R.id.my_card_listView);

        List<Card> cardList = new ArrayList<Card>();
        //TODO 添加数据需要动态调整
        for (int i = 0; i < 6; i++) {
            Card card = new Card(R.mipmap.mycard,
                        "使用限制xxxxxxxx",
                        "使用规则xxxxxxxx",
                        "晓礼网创意婚庆礼品优惠券",
                        "2015-6-15至2015-8-15"
                    );
            cardList.add(card);
        }
        MyCardAdapter adapter = new MyCardAdapter(cardList,this);
        listView.setAdapter(adapter);
    }


}
