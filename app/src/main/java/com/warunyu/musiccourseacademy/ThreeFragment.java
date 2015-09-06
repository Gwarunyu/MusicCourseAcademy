package com.warunyu.musiccourseacademy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThreeFragment extends Fragment {

    TextView txtFrag3;

    public ThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);

        txtFrag3= (TextView) rootView.findViewById(R.id.txtFrag3);

        return rootView;
    }

    public String getText(){

        return txtFrag3.getText().toString();

    }

    public static ThreeFragment newInstance() {

        ThreeFragment fragment = new ThreeFragment();
        return fragment;
    }
}
