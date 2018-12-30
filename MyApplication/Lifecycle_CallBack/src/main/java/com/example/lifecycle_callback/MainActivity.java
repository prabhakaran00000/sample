package com.example.lifecycle_callback;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("check","OnCreate++");
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("check","onStart ++");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("check","onRestart ++");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("check","onResume ++");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("check","onPause ++");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("check","onStop ++");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("check","onDestroy ++");
    }
}
