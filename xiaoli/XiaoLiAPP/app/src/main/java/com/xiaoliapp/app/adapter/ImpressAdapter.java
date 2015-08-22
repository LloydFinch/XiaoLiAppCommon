package com.xiaoliapp.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaoliapp.app.R;
import com.xiaoliapp.app.entity.MyImpress;

import java.util.List;

/**
 * Created by Administrator on 2015/8/20.
 * Project:XiaoLiApp
 * User:king
 * Date:2015/8/20
 * Time:14:43
 */
public class ImpressAdapter extends BaseAdapter {
	private Context context;
	private List<MyImpress> list;
	private LayoutInflater layoutInflater;

	public ImpressAdapter(Context context, List<MyImpress> list) {
		this.context = context;
		this.list = list;
		layoutInflater = LayoutInflater.from(context);

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
		if (convertView != null) {
			view = convertView;
		} else {
			view = layoutInflater.inflate(R.layout.item_impress_view, parent, false);
		}

		ViewHolder holder = (ViewHolder) view.getTag();
		if (holder == null) {
			holder = new ViewHolder();
			holder.imageView = (ImageView) view.findViewById(R.id.item_impress_image);
			holder.nick = (TextView) view.findViewById(R.id.item_impress_nick);
			holder.date = (TextView) view.findViewById(R.id.item_impress_text_date);
			holder.btn_zan = (CheckBox) view.findViewById(R.id.item_impress_zan);
			holder.btn_cai = (CheckBox) view.findViewById(R.id.item_impress_cai);
			view.setTag(holder);
		}
		//////////////////////
		//设置数据
		MyImpress impress = list.get(position);
		holder.imageView.setImageResource(impress.getImage());
		holder.nick.setText(impress.getNick());
		holder.date.setText(impress.getDate());
		holder.btn_zan.setText(impress.getZan());
		holder.btn_cai.setText(impress.getCai());
		return view;
	}

	class ViewHolder {
		public ImageView imageView;
		public TextView nick;
		public TextView date;
		public CheckBox btn_zan;
		public CheckBox btn_cai;

	}

}
