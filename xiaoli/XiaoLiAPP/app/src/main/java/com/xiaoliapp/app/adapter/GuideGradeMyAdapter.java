package com.xiaoliapp.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.xiaoliapp.app.R;

/**
 * Created by Administrator on 15-8-17.
 */
public class GuideGradeMyAdapter extends BaseAdapter{
    private Context context;


    public GuideGradeMyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 9;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        View view = relativeLayouts.get(position);
        RelativeLayout r = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.item_guide_my_list,parent,false);
        View view = null;

        view = r;
        return view;
    }
}
