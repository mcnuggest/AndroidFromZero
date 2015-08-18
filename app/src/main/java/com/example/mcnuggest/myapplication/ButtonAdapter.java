package com.example.mcnuggest.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.List;


/**
 * Created by mcnuggest on 15/8/18.
 */
public class ButtonAdapter extends ArrayAdapter<HomeButton> {
    private int id;

    public ButtonAdapter(Context context, int ResourceId, List<HomeButton> objects) {
        super(context, ResourceId, objects);
        id = ResourceId;
    }

    public View getview(int position, View convertView, ViewGroup parent) {
        HomeButton homeButton = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(id, null);
        Button button = (Button) view.findViewById(R.id.homebutton);
        button.setText(homeButton.getId());
        return view;
    }

}
