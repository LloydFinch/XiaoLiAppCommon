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
import com.xiaoliapp.app.entity.Card;

import java.util.List;

/**
 * Created by Administrator on 2015/8/18.
 * Project:XiaoLiApp
 * User:king
 * Date:2015/8/18
 * Time:9:51
 */

/**
 * 页面26---情礼攻略--我的卡券适配器
 */
public class MyCardAdapter extends BaseAdapter {
    private Context context;
    private List<Card> cards;
    private View.OnClickListener onClickListener;

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public MyCardAdapter(List<Card> cards, Context context) {
        this.cards = cards;
        this.context = context;
    }

    @Override
    public int getCount() {
        int ret = 0;
        if(cards!=null){
            ret = cards.size();
        }
        return ret;
    }

    @Override
    public Object getItem(int position) {
        Object ret = null;
        if(cards!=null){
            ret = cards.get(position);
        }
        return ret;
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
           view = LayoutInflater.from(context).inflate(R.layout.item_my_card,parent,false);
        }
        //////////////////////////
        ViewHolder holder = (ViewHolder)view.getTag();
        if(holder==null){
            holder = new ViewHolder();
            holder.imageView = (ImageView)view.findViewById(R.id.item_my_card_imageView);
            holder.txtTitle = (TextView)view.findViewById(R.id.item_my_card_text_card);
            holder.txtRule =(TextView)view.findViewById(R.id.item_my_card_text_rule);
            holder.txtLimit =(TextView)view.findViewById(R.id.item_my_card_text_limit);
            holder.txtDate = (TextView)view.findViewById(R.id.item_my_card_text_date);
            holder.button = (Button) view.findViewById(R.id.item_my_card_button);
            //给Button设置监听事件
            holder.button.setOnClickListener(onClickListener);
            view.setTag(holder);
        }

        //TODO 设置数据
        Card card = cards.get(position);

        holder.imageView.setImageResource(card.getCard_image());
        holder.txtTitle.setText(card.getCard_title());
        holder.txtRule.setText(card.getCard_rule());
        holder.txtLimit.setText(card.getCard_limit());
        holder.txtDate.setText(card.getDate());
        return view;
    }


    private static class ViewHolder{
        public ImageView imageView;
        public TextView txtTitle;
        public TextView txtRule;
        public TextView txtLimit;
        public TextView txtDate;
        public Button button;
    }

}
