package com.example.shop.core.android;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shop.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
