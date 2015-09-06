package com.warunyu.musiccourseacademy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dell-NB on 30/8/2558.
 */
public class CustomAdapter extends BaseAdapter {

    Context mContext;
    String[] strTitle;
    String[] strDesc;
    Integer[] resID;

    public CustomAdapter(Context context,String[] strTitle, String[] strDesc,Integer[] resID ){
        this.mContext = context;
        this.strTitle = strTitle;
        this.strDesc = strDesc;
        this.resID = resID;
    }

    @Override
    public int getCount() {
        return strTitle.length;
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
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInfrater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        if(view == null)
            view = mInfrater.inflate(R.layout.custom_listview,parent,false);

            TextView tvTitle = (TextView) view.findViewById(R.id.lis_title);
            tvTitle.setText(strTitle[position]);

            TextView tvDesc = (TextView) view.findViewById(R.id.lis_desc);
            tvDesc.setText(strDesc[position]);

            ImageView imageView = (ImageView) view.findViewById(R.id.lis_thumbnail);
            imageView.setBackgroundResource(resID[position]);

            return view;}
    }

