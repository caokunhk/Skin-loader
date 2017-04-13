package com.example3.ck.skin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import cn.feng.skinpackage.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    /**
     * feature-1
     * display HelloWorld
     * @param view
     */
    public void feature1(View view) {
        Log.i("123","feature1");
    }
}
