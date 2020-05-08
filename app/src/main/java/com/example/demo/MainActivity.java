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
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.demo.fragment.ViewPagerFragment;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity implements View.OnFocusChangeListener {
    private TextView tab1;
    private TextView tab2;
    private TextView tab3;
    private Integer pos;
    private final String TAG = "MainActivity";
    public LinearLayout container;
    ViewPagerFragment viewPagerFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);
        container = findViewById(R.id.container);
        tab1.setOnFocusChangeListener(this);
        tab2.setOnFocusChangeListener(this);
        tab3.setOnFocusChangeListener(this);

//        viewPagerFragment = new ViewPagerFragment();
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.container, viewPagerFragment)
//                .commit();
        viewPagerFragment =(ViewPagerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);

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
        Log.d(TAG, "onFocusChange: view.id= "+v.getId() + " status:"+hasFocus);
        switch (v.getId()) {
            case R.id.tab1:
                if (hasFocus && pos != R.id.tab1 && ViewPagerFragment.focusView == null) {
                    viewPagerFragment.setViewPagerItem(0);
                    pos = R.id.tab1;
                }
                break;
            case R.id.tab2:
                if (hasFocus && pos != R.id.tab2) {
                    viewPagerFragment.setViewPagerItem(1);
                    pos = R.id.tab2;
                }
                break;
            case R.id.tab3:
                if (hasFocus && pos != R.id.tab3) {
                    viewPagerFragment.setViewPagerItem(2);
                    pos = R.id.tab3;
                }
                break;
        }
    }
}
