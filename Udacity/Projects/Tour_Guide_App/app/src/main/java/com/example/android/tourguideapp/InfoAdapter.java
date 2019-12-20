package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<StringObject> {

public InfoAdapter (Activity context, ArrayList<StringObject> stringObjects) {
    super(context, 0, stringObjects);
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.items_layout, parent, false);
        }

        // Get the  object located at this position in the list
        StringObject currentObjectPosition = getItem(position);


        TextView info1TextView = (TextView) listItemView.findViewById(R.id.info1);

        info1TextView.setText(currentObjectPosition.getmDescription1());


        TextView info2TextView = (TextView) listItemView.findViewById(R.id.info2);

        info2TextView.setText(currentObjectPosition.getmDescription2());

        return listItemView;
    }
}
