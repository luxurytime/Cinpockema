package com.c9.cinpockema.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.c9.cinpocketma.R;
import com.c9.cinpockema.model.Cinema;

import java.util.ArrayList;


/**
 * Created by a694393453 on 2016/4/21.
 */
public class CinemaAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Cinema> cinemaList;

    public CinemaAdapter(Context context, ArrayList<Cinema> cinemaList) {
        inflater = LayoutInflater.from(context);
        this.cinemaList = cinemaList;
    }

    @Override
    public int getCount() {
        return cinemaList.size();
    }

    @Override
    public Object getItem(int position) {
        return cinemaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CinemaViewHolder cinemaViewHolder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.cinema_item,null);
            cinemaViewHolder = new CinemaViewHolder();
            cinemaViewHolder.cinemaName = (TextView) convertView.findViewById(R.id.cinema_name);
            cinemaViewHolder.cinemaLocation = (TextView) convertView.findViewById(R.id.cinema_location);
            cinemaViewHolder.cinemaDistance = (TextView) convertView.findViewById(R.id.cinema_distance);
            convertView.setTag(cinemaViewHolder);
        } else {
            cinemaViewHolder = (CinemaViewHolder) convertView.getTag();
        }
        cinemaViewHolder.cinemaName.setText(cinemaList.get(position).getName());
        cinemaViewHolder.cinemaLocation.setText(cinemaList.get(position).getLocation());
        //距离的计算未解决
        cinemaViewHolder.cinemaDistance.setText("500m");

        //Log.v("size:","size is"+cinemaList.size());
        return convertView;
    }

    //展示电影简略信息
    public class CinemaViewHolder {
        public TextView cinemaName;
        public TextView cinemaLocation;
        public TextView cinemaDistance;
    }
}

