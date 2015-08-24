package com.xiaoliapp.app.fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ListView;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.activity.GuideDetailActivity;
import com.xiaoliapp.app.adapter.RelationInnerAdapter;

public class GuideInnerFragment extends Fragment implements AdapterView.OnItemClickListener {


	private ListView listView;
	private RelationInnerAdapter adapter;
	private Context context;

	public GuideInnerFragment() {

	}

	public void setContext(Context context) {
		this.context = context;
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_guide_inner, container, false);
		listView = (ListView) view.findViewById(R.id.fragment_guide_inner_list);
		adapter = new RelationInnerAdapter(getActivity());
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
		return view;
	}

	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		//TODO 需要携带相应位置的信息到详情页
		Intent intent = new Intent(getActivity(), GuideDetailActivity.class);
		startActivity(intent);
	}
}
