package com.gmail.cristobalhdez.android_semana1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by jchernandez on 4/07/16.
 */
public class puppyAdapter extends BaseAdapter {
    Context context;
    String[] data;
    private static LayoutInflater inflater = null;

    public puppyAdapter(Context context, String[] mascotas){
        this.context = context;
        this.data = mascotas;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        if(vista==null){
            vista = inflater.inflate(R.layout.puppy_element, null);
        }
        TextView puppy_name = (TextView) vista.findViewById(R.id.puppy_name);
        puppy_name.setText(data[position]);
        return vista;
    }
}
