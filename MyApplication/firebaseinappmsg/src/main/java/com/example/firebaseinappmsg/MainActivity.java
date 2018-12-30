package com.example.firebaseinappmsg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp instance = FirebaseApp.getInstance();
        FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(instance);
        Log.d("data","Id "+firebaseInstanceId.getId());
        Log.d("data","Token "+firebaseInstanceId.getToken());
    }
}
