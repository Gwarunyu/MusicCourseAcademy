package com.warunyu.musiccourseacademy;


import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class OneFragment extends Fragment {

    private TextView txtFrag1;
    private Button btn_fragment1;


    public static OneFragment newInstance() {
        OneFragment fragment = new OneFragment();
        return fragment;
    }

    public String getText() {
        return txtFrag1.getText().toString();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        txtFrag1 = (TextView) rootView.findViewById(R.id.txtFrag1);
        btn_fragment1 = (Button) rootView.findViewById(R.id.btn_fragment1);

        btn_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CourseActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

}

