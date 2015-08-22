package com.xiaoliapp.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.entity.Grade;


import java.util.List;

/**
 * Created by Administrator on 2015/8/19.
 * Project:XiaoLiApp
 * User:king
 * Date:2015/8/19
 * Time:16:04
 */
public class GradeAdapter extends BaseAdapter {

    private Context context;
    private List<Grade> grades;
    private View.OnClickListener onClickListener;

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public GradeAdapter(Context context, List<Grade> grades) {
        this.context = context;
        this.grades = grades;
    }

    @Override
    public int getCount() {
        return grades.size();
    }

    @Override
    public Object getItem(int position) {
        return grades.get(position);
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
            view = LayoutInflater.from(context).inflate(R.layout.item_grade,parent,false);
        }
        ViewHolder holder = (ViewHolder)view.getTag();
        if(holder==null){
            holder = new ViewHolder();
            holder.imageView = (ImageView)view.findViewById(R.id.grade_person_icon);
            holder.txt_nick = (TextView) view.findViewById(R.id.grade_person_nick);
            holder.txt_date = (TextView) view.findViewById(R.id.grade_date);

            holder.txt_cai = (TextView) view.findViewById(R.id.grade_cai);
            //设置点击"踩"事件
            holder.txt_cai.setOnClickListener(onClickListener);
            holder.txt_zan = (TextView) view.findViewById(R.id.grade_zan);
            //设置点击"赞"事件
            holder.txt_zan = (TextView)view.findViewById(R.id.grade_zan);
            holder.txt_score = (TextView)view.findViewById(R.id.grade_score);
            view.setTag(holder);
        }
        //设置数据
        Grade grade = grades.get(position);
        holder.imageView.setImageResource(grade.getImage());
        holder.txt_nick.setText(grade.getNick());
        holder.txt_cai.setText(grade.getCai());
        holder.txt_zan.setText(grade.getZan());
        holder.txt_score.setText(grade.getScore());
        holder.txt_date.setText(grade.getDate());
        return view;
    }


    private static class ViewHolder{
        public ImageView imageView;
        public TextView txt_nick;
        public TextView txt_zan;
        public TextView txt_cai;
        public TextView txt_date;
        public TextView txt_score;
    }


}
