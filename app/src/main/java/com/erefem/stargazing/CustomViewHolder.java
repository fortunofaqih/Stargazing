package com.erefem.stargazing;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView tv_object_name,tv_observer,tv_latitude,tv_longitude,tv_date,tv_time,tv_seeing,tv_instrument,tv_magnification,tv_filter,tv_description_object;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_object_name = itemView.findViewById(R.id.tv_object_name);
        tv_observer = itemView.findViewById(R.id.tv_observer);
        tv_latitude = itemView.findViewById(R.id.tv_latitude);
        tv_longitude = itemView.findViewById(R.id.tv_longitude);
        tv_date = itemView.findViewById(R.id.tv_date);
        tv_time = itemView.findViewById(R.id.tv_time);
        tv_seeing = itemView.findViewById(R.id.tv_seeing);
        tv_instrument = itemView.findViewById(R.id.tv_instrument);
        tv_magnification = itemView.findViewById(R.id.tv_magnification);
        tv_filter = itemView.findViewById(R.id.tv_filter);
        tv_description_object = itemView.findViewById(R.id.tv_description_object);
    }
}
