package com.ahnsafety.ex25activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle("ThirdActivity");
        actionBar.setDisplayHomeAsUpEnabled(true);

    }
}
