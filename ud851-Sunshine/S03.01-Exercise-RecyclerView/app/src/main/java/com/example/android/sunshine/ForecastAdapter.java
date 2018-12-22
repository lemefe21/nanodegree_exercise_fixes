package com.example.android.sunshine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;

    public ForecastAdapter() {

    }

    @NonNull
    @Override
    public ForecastAdapter.ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        Context context = viewGroup.getContext();
        int layoutIdForItemList = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForItemList, viewGroup, shouldAttachToParentImmediately);

        ForecastAdapterViewHolder viewHolder = new ForecastAdapterViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastAdapter.ForecastAdapterViewHolder forecastAdapterViewHolder, int position) {

        forecastAdapterViewHolder.mWeatherTextView.setText(mWeatherData[position]);

    }

    @Override
    public int getItemCount() {

        if(mWeatherData == null) {
            return 0;
        } else {
            return mWeatherData.length;
        }

        //or
        /*
        if (null == mWeatherData) return 0;
        return mWeatherData.length;
         */

    }

    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(@NonNull View view) {
            super(view);
            mWeatherTextView = view.findViewById(R.id.tv_weather_data);
        }
    }

}
