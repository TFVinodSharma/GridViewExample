package com.kashmiriguruji.gridviewexample;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v7.widget.RecyclerView.*;

class MainAdapter  extends BaseAdapter {


    private Context  context;
    private LayoutInflater layoutInflater;
    private  String[] number;
    private int[] image;

public MainAdapter(Context c,String[] number,int[] image )
{
    context =c;
    this.number=number;
    this.image=image;

}

    @Override
    public int getCount() {
        return number.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    if ( layoutInflater==null)
    {
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    if (convertView==null){
        convertView=layoutInflater.inflate(R.layout.raw_item,null);

    }

        ImageView im=convertView.findViewById(R.id.imageview);
        TextView tex=convertView.findViewById(R.id.textview);
        im.setImageResource(image[position]);
        tex.setText(number[position]);
        return convertView;
    }
}
