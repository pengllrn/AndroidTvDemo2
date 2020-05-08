package com.example.demo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.demo.R;
import com.example.demo.SecondActivity;

public class Tab1Fragment extends Fragment implements View.OnClickListener{
    Button tab1_btn1;
    Button tab1_btn2;
    Button tab1_btn3;
    Button tab1_btn4;
    Button tab1_btn5;
    Button tab1_btn6;
    Button tab1_btn7;
    Button tab1_btn8;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab1,container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tab1_btn1 = view.findViewById(R.id.tab1_btn1);
        tab1_btn2 = view.findViewById(R.id.tab1_btn2);
        tab1_btn3 = view.findViewById(R.id.tab1_btn3);
        tab1_btn4 = view.findViewById(R.id.tab1_btn4);
        tab1_btn5 = view.findViewById(R.id.tab1_btn5);
        tab1_btn6 = view.findViewById(R.id.tab1_btn6);
        tab1_btn7 = view.findViewById(R.id.tab1_btn7);
        tab1_btn8 = view.findViewById(R.id.tab1_btn8);
        tab1_btn1.setOnClickListener(this);
        tab1_btn2.setOnClickListener(this);
        tab1_btn3.setOnClickListener(this);
        tab1_btn4.setOnClickListener(this);
        tab1_btn5.setOnClickListener(this);
        tab1_btn6.setOnClickListener(this);
        tab1_btn7.setOnClickListener(this);
        tab1_btn8.setOnClickListener(this);
    }

    /**
     * button触发页面的跳转
     * @param v
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), SecondActivity.class);
        startActivity(intent);
    }


}
