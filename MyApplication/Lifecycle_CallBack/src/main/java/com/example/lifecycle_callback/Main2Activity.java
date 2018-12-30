package com.example.lifecycle_callback;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("check","OnCreate 1 ++");
        setContentView(R.layout.activity_main2);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("check","onStart 1 ++");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("check","onRestart 1 ++");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("check","onResume 1 ++");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("check","onPause 1 ++");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("check","onStop 1 ++");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("check","onDestroy 1 ++");
    }
}
