package com.xiaoliapp.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.entity.Myself;


import java.util.List;

/**
 * Created by Administrator on 2015/8/14.
 * Project:XiaoLiApp
 * User:king
 * Date:2015/8/14
 * Time:19:36
 */
public class MyselfAdapter extends BaseAdapter {
    private   List<Myself> list;
    private Context context;

    public MyselfAdapter(Context context, List<Myself> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        int ret = 0;
        if(list !=null){
            ret = list.size();
        }
        return ret;
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
        ViewHolder  holder = null;
        if(convertView!=null){
            view = convertView;
        }else {
            view = LayoutInflater.from(context).inflate(R.layout.common_layout,parent,false);
        }

        holder = (ViewHolder)view.getTag();
        if(holder==null){
            holder  = new ViewHolder();
            holder.imageView = (ImageView)view.findViewById(R.id.common_image);
            holder.textView = (TextView) view.findViewById(R.id.common_text);
            holder.button = (Button)view.findViewById(R.id.common_button);
            view.setTag(holder);
        }

         Myself myself01 = (Myself) getItem(position);

        holder.imageView.setImageResource(myself01.getImageId());
        holder.textView.setText(myself01.getName());

        return view;
    }

    private static class ViewHolder{
        private ImageView imageView;
        private TextView textView;
        private Button button;
    }

}
