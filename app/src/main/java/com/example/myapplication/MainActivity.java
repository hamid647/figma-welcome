package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {


    private View _bg__home_page;
    private View _bg__group_11_ek1;
    private ImageView vector_1;
    private ImageView vector_2;
    private View _bg__group_10_ek1;
    private View rectangle_1;
    private TextView swip_up_to_start;
    private View _bg___group_9_ek1;
    private View rectangle_2;
    private ImageView plane;
    private TextView welcome;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);


        _bg__home_page = (View) findViewById(R.id._bg__home_page);
        _bg__group_11_ek1 = (View) findViewById(R.id._bg__group_11_ek1);
        vector_1 = (ImageView) findViewById(R.id.vector_1);
        vector_2 = (ImageView) findViewById(R.id.vector_2);
        _bg__group_10_ek1 = (View) findViewById(R.id._bg__group_10_ek1);
        rectangle_1 = (View) findViewById(R.id.rectangle_1);
        swip_up_to_start = (TextView) findViewById(R.id.swip_up_to_start);
        _bg___group_9_ek1 = (View) findViewById(R.id._bg___group_9_ek1);
        rectangle_2 = (View) findViewById(R.id.rectangle_2);
        plane = (ImageView) findViewById(R.id.plane);
        welcome = (TextView) findViewById(R.id.welcome);


        //custom code goes here

    }
}

