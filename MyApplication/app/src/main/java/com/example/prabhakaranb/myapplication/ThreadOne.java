package com.example.prabhakaranb.myapplication;

import android.util.Log;

import java.sql.Timestamp;

public class ThreadOne extends Thread {

    @Override
    public void run() {
        Log.d("data1",""+System.currentTimeMillis());
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d("data1",""+System.currentTimeMillis());
    }
}
