package com.ltdd.baikt1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MemberAdapter extends BaseAdapter {
    private Activity activity;
    private List<Member> items;

    public MemberAdapter(Activity activity, List<Member> items) {
        this.activity = activity;
        this.items = items;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.item, null);
        TextView tvName = (TextView) view.findViewById(R.id.tv_name);
        TextView tvNgheDanh = (TextView) view.findViewById(R.id.tv_nickname);
        TextView tvQue = (TextView) view.findViewById(R.id.tv_countryside);
        TextView tvLuotThich = (TextView) view.findViewById(R.id.tv_star);
        ImageView imageView = (ImageView) view.findViewById(R.id.imgHinh);
        tvName.setText(items.get(i).getHoten());
        tvNgheDanh.setText(items.get(i).getNghedanh());
        tvQue.setText(items.get(i).getQue());
        tvLuotThich.setText(String.valueOf(items.get(i).getSoLuotThich()));
        imageView.setImageResource(items.get(i).getHinhAnh());
        return view;
    }
}
