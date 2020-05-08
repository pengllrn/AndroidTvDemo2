package com.example.demo.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demo.R;
import com.example.demo.adapter.TabViewPagerAdapter;

import java.util.ArrayList;

public class ViewPagerFragment extends Fragment {
    private ViewPager viewPager;
    public static View focusView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_viewpager, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager = view.findViewById(R.id.view_pager);

        //添加三个page fragment
        ArrayList<Fragment> fmList = new ArrayList<>();
        fmList.add(new Tab1Fragment());
        fmList.add(new Tab2Fragment());
        fmList.add(new Tab3Fragment());
        viewPager.setAdapter(new TabViewPagerAdapter(fmList, getChildFragmentManager()));
    }

    public void setViewPagerItem(int index){
        viewPager.setCurrentItem(index);
    }
}
