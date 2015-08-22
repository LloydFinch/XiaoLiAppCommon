package com.xiaoliapp.app.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.GridView;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.adapter.ProfileNetRelationAdapter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * “我的”---“我的关系网络图”页面
 */
public class NetRelationActivity extends BaseActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}

	protected void init() {
		super.setTitle("我的关系网络图");
		super.setCancel(false);

		RelativeLayout l = (RelativeLayout) findViewById(R.id.base_block_top);
		l.setBackgroundColor(Color.parseColor("#df1135"));

		RelativeLayout content = (RelativeLayout) this.findViewById(R.id.activity_base_content);
		content = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_net_relation_content, content);


		int[] images = {R.mipmap.discover, R.mipmap.card, R.mipmap.discover, R.mipmap.discover_checked,
				R.mipmap.grade, R.mipmap.group, R.mipmap.guide_checked, R.mipmap.card};
		List<Map<String, Object>> list = new LinkedList<Map<String, Object>>();
		for (int i = 0; i < images.length; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", "头像" + (i + 1));
			map.put("image", images[i]);
			list.add(map);
		}

		GridView gridView = (GridView) content.findViewById(R.id.profile_netrelation_mostrelation);
		GridView gridView1 = (GridView) content.findViewById(R.id.profile_netrelation_mostintrsting);
		GridView gridView2 = (GridView) content.findViewById(R.id.profile_netrelation_mostknown);
		ProfileNetRelationAdapter adapter = new ProfileNetRelationAdapter(this, list);
		gridView.setAdapter(adapter);
		gridView1.setAdapter(adapter);
		gridView2.setAdapter(adapter);
	}

}
