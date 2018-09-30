package com.odiebat.elham.openweather.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.odiebat.elham.openweather.Model.Android;
import com.odiebat.elham.openweather.Model.Example;
import com.odiebat.elham.openweather.Model.Weather;
import com.odiebat.elham.openweather.Model.WeatherData;
import com.odiebat.elham.openweather.R;


import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private List<com.odiebat.elham.openweather.Model.List> mWeatherList;

    public DataAdapter(List<com.odiebat.elham.openweather.Model.List> WeatherList) {
        mWeatherList = WeatherList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTvName.setText(mWeatherList.get(position).getDtTxt());
        holder.mTvVersion.setText(mWeatherList.get(position).getDt());
        holder.mTvApi.setText(mWeatherList.get(position).getMain().getHumidity());
        Log.v("elham",mWeatherList.get(position).getMain().getHumidity().toString());
    }

    @Override
    public int getItemCount() {
        return mWeatherList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView mTvName,mTvVersion,mTvApi;
        public ViewHolder(View view) {
            super(view);

            mTvName = (TextView)view.findViewById(R.id.tv_name);
            mTvVersion = (TextView)view.findViewById(R.id.tv_version);
            mTvApi = (TextView)view.findViewById(R.id.tv_api_level);
        }
    }
}