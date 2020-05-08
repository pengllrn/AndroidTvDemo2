package com.example.demo.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.demo.MainActivity;
import com.example.demo.R;

public class Tab2Fragment extends Fragment implements View.OnClickListener{
    Button tab2_btn1;
    Button tab2_btn2;
    Button tab2_btn3;
    Button tab2_btn4;
    Button tab2_btn5;
    Button tab2_btn6;
    Button tab2_btn7;
    Button tab2_btn8;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab2,container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tab2_btn1 = view.findViewById(R.id.tab2_btn1);
        tab2_btn2 = view.findViewById(R.id.tab2_btn2);
        tab2_btn3 = view.findViewById(R.id.tab2_btn3);
        tab2_btn4 = view.findViewById(R.id.tab2_btn4);
        tab2_btn5 = view.findViewById(R.id.tab2_btn5);
        tab2_btn6 = view.findViewById(R.id.tab2_btn6);
        tab2_btn7 = view.findViewById(R.id.tab2_btn7);
        tab2_btn8 = view.findViewById(R.id.tab2_btn8);
        tab2_btn1.setOnClickListener(this);
        tab2_btn2.setOnClickListener(this);
        tab2_btn3.setOnClickListener(this);
        tab2_btn4.setOnClickListener(this);
        tab2_btn5.setOnClickListener(this);
        tab2_btn6.setOnClickListener(this);
        tab2_btn7.setOnClickListener(this);
        tab2_btn8.setOnClickListener(this);
    }

    /**
     * button触发页面的跳转
     * @param v
     */
    @Override
    public void onClick(View v) {
        getActivity().getSupportFragmentManager().beginTransaction()
                .add(android.R.id.content, new SecondFragment())
                .addToBackStack("")
                .commit();
        MainActivity activity = (MainActivity) getActivity();
        //记住跳转位置
        ViewPagerFragment.focusView = v;
        //隐藏当前视图，这样在second fragment上移动时，焦点不会跳出
        activity.container.setVisibility(View.INVISIBLE);
    }

}
