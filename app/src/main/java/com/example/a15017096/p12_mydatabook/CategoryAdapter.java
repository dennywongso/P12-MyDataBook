package com.example.a15017096.p12_mydatabook;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 15017096 on 10/8/2017.
 */

public class CategoryAdapter extends ArrayAdapter {
    private ArrayList<String> category;
    private Context context;
    private TextView tvCategory;
    private ImageView ivCategory;

    public CategoryAdapter(Context context, int resource, ArrayList<String> objects ){
        super(context, resource, objects);
        this.context = context;
        category = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=  (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.row,parent,false);
        tvCategory = (TextView)row.findViewById(R.id.tvCategory);
        ivCategory = (ImageView) row.findViewById(R.id.ivCategory);

        String current = category.get(position);
        tvCategory.setText(current.toString());
        if(current.toString().equalsIgnoreCase("bio")){
            ivCategory.setImageResource(android.R.drawable.ic_dialog_info);
        } else if(current.toString().equalsIgnoreCase("About Us")){
            ivCategory.setImageResource(android.R.drawable.btn_star_big_on);
        } else if(current.toString().equalsIgnoreCase("Anniversary")){
            ivCategory.setImageResource(android.R.drawable.ic_menu_today);
        } else {
            ivCategory.setImageResource(android.R.drawable.ic_menu_edit);
        }
        return row;
    }
}
