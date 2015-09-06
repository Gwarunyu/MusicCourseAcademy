package com.warunyu.musiccourseacademy;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class MyPageAdapter extends FragmentPagerAdapter {

    private final Integer PAGE_NUM = 3;

    public MyPageAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return OneFragment.newInstance();
        } else if (position == 1) {
            return TwoFragment.newInstance();
        } else if (position == 2) {
            return ThreeFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_NUM;
    }
}
