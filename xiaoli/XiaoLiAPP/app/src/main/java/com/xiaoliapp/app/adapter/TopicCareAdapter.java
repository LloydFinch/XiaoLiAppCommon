package com.xiaoliapp.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.entity.TopicCare;

import java.util.List;


/**
 * Created by Administrator on 2015/8/21.
 * Project:XiaoLiApp
 * User:king
 * Date:2015/8/21
 * Time:9:57
 */


public class TopicCareAdapter extends BaseAdapter {
    private List<TopicCare> list;

    private Context context;

    public TopicCareAdapter(Context context, List<TopicCare> list) {
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
        if(convertView!=null){
            view = convertView;
        }else{
            view = LayoutInflater.from(context).inflate(R.layout.item_topic_care,null);
        }
        ViewHolder holder = (ViewHolder)view.getTag();
        if(holder==null){
            holder = new ViewHolder();
            holder.imageView = (ImageView)view.findViewById(R.id.item_topic_care_image);
            holder.textView = (TextView)view.findViewById(R.id.item_topic_care_text);
            view.setTag(holder);
        }

        ///////////
        //设置数据
        TopicCare topicCare = list.get(position);
        holder.imageView.setImageResource(topicCare.getImage());
        holder.textView.setText(topicCare.getDetails());

        return view;
    }

    private static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }

}
