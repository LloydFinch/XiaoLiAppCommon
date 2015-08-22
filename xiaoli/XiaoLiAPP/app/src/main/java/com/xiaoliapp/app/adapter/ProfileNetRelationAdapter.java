package com.xiaoliapp.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaoliapp.app.R;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 15-8-17.
 */
public class ProfileNetRelationAdapter extends BaseAdapter{
    private Context context;
    private List<Map<String,Object>> list;

    public ProfileNetRelationAdapter(Context context, List<Map<String, Object>> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        LinearLayout l = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.item_profile_grid,parent,false);
        view = l;
        Map<String,Object> map = list.get(position);
        TextView textView = (TextView) l.findViewById(R.id.profile_netralation_grid_item_txt);
        ImageView imageView = (ImageView) l.findViewById(R.id.profile_netralation_grid_item_img);
        String name = (String) map.get("name");
        int id =(Integer) map.get("image");
        textView.setText(name);
        imageView.setImageResource(id);
        return l;
    }
}
