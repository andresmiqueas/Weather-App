package com.example.weatherapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] ciudades;

    public MyAdapter(Context context, String[] ciudades) {
        super(context, R.layout.list_item, ciudades);
        this.context = context;
        this.ciudades = ciudades;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item, parent, false);

        TextView textViewCity = rowView.findViewById(R.id.textViewCity);

        String ciudad = ciudades[position];
        textViewCity.setText(ciudad);

        return rowView;
    }
}
