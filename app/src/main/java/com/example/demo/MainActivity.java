/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.example.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import com.example.demo.adapter.TabViewPagerAdapter;
import com.example.demo.fragment.Tab1Fragment;
import com.example.demo.fragment.Tab2Fragment;
import com.example.demo.fragment.Tab3Fragment;

import java.util.ArrayList;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity implements View.OnFocusChangeListener {
    private ViewPager viewPager;
    private TextView tab1;
    private TextView tab2;
    private TextView tab3;
    private Integer pos;
    private final String TAG = "MainActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);
        tab1.setOnFocusChangeListener(this);
        tab2.setOnFocusChangeListener(this);
        tab3.setOnFocusChangeListener(this);

        //添加三个page fragment
        ArrayList<Fragment> fmList = new ArrayList<>();
        fmList.add(new Tab1Fragment());
        fmList.add(new Tab2Fragment());
        fmList.add(new Tab3Fragment());
        viewPager.setAdapter(new TabViewPagerAdapter(fmList, getSupportFragmentManager()));
        pos = R.id.tab1;//当前位置
    }


    /**
     * 通过tab控制viewpager页面的切换
     *
     * @param v
     * @param hasFocus
     */
    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        switch (v.getId()) {
            case R.id.tab1:
                if (hasFocus && pos != R.id.tab1) {
                    viewPager.setCurrentItem(0);
                    pos = R.id.tab1;
                }
                break;
            case R.id.tab2:
                if (hasFocus && pos != R.id.tab2) {
                    viewPager.setCurrentItem(1);
                    pos = R.id.tab2;
                }
                break;
            case R.id.tab3:
                if (hasFocus && pos != R.id.tab3) {
                    viewPager.setCurrentItem(2);
                    pos = R.id.tab3;
                }
        }
    }
}
