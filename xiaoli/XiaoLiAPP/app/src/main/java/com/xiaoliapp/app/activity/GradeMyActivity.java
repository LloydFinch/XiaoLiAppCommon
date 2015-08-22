package com.xiaoliapp.app.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.adapter.GuideGradeMyAdapter;

/**
 * “情礼攻略”---“我的打分”界面
 */
public class GradeMyActivity extends BaseActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}

	protected void init() {

		super.setTitle("阿三");
		super.setBack(false);
		super.setCancel(false);

		RelativeLayout l = (RelativeLayout) findViewById(R.id.base_block_top);
		l.setBackgroundColor(Color.parseColor("#df1135"));


		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_grade_my_content, content);

		ListView listView = (ListView) content.findViewById(R.id.guide_grade_my_listview);
//        ArrayList<String> list = new ArrayList();
//        for (int i = 0; i < 30; i++) {
//            list.add("ins..."+i);
//        }
//        adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,list);
//        List<RelativeLayout> relativeLayouts = new LinkedList<RelativeLayout>();
//        for (int i = 0; i < 9; i++) {
//        RelativeLayout r = (RelativeLayout) inflater.inflate(R.layout.item_guide_my_list, container, false);
//            relativeLayouts.add(r);
//        }
		GuideGradeMyAdapter adapter = new GuideGradeMyAdapter(this);
		listView.setAdapter(adapter);
	}
}
