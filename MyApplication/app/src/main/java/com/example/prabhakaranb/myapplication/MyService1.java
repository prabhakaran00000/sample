package com.example.prabhakaranb.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.Timer;

public class MyService1 extends Service  {

    public int i;
    public class MyBinder extends Binder {
        public MyService1 getService(){
            return MyService1.this;
        }

    }

    private MyBinder myBinder =  new MyBinder();

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i= 1; i< 15; i++){
                    MyService1.this.i = i;
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.d("data1","Value "+i);
                }

            }
        }).start();

        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.d("data1","Destroyed ");
        stopSelf();
        super.onDestroy();
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("data1","Service Binded ");
        return myBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d("data1","Service UnBinded ");
        return super.onUnbind(intent);
    }
}
