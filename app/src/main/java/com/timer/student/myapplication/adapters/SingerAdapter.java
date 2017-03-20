package com.timer.student.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.timer.student.myapplication.R;
import com.timer.student.myapplication.models.SingerModel;

import java.util.List;

/**
 * Created by Student on 2017-03-15.
 */

public class SingerAdapter extends BaseAdapter {

    private final List<SingerModel> mData;

    public SingerAdapter(List<SingerModel> data) {
        this.mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();

            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.sing_item,parent,false);

            viewHolder.textView = (TextView) convertView.findViewById(R.id.singText_view);

            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        SingerModel singerModel = mData.get(position);
        viewHolder.textView.setText(singerModel.getSinger());

        return convertView;
    }

    private static class ViewHolder{
        TextView textView;
    }
}
