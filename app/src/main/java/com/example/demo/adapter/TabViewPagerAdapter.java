package com.example.demo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class TabViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;

    public TabViewPagerAdapter(ArrayList<Fragment> list, FragmentManager fm){
        super(fm);
        this.list = list;
    }
    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
