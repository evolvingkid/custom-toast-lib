package com.example.test_new_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.custom_toast.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomToast.show(MainActivity.this, "Custom Toast");
    }
}