package com.example.prabhakaranb.myapplication;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.support.design.widget.TextInputLayout;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ThreadOne threadOne;
    ServiceConnection serviceConnection;
    boolean serviceConnected;
    TextView textView;
    MyService1 myService1;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        Button button = findViewById(R.id.bt);
        Button button1 = findViewById(R.id.bt1);
        Button button2 = findViewById(R.id.bt2);
        Button button3 = findViewById(R.id.bt3);
        Button button4 = findViewById(R.id.bt4);
      textView = findViewById(R.id.tv);

        intent = new Intent(this,MyService1.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              startService(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              stopService(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindMyService();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(serviceConnected)
               unbindService(serviceConnection);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(""+myService1.i);
            }
        });


//        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
//        registerReceiver(new MyReceiver(),new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
//
//        Intent intent = new Intent();
//        intent.setAction("android.net.conn.CONNECTIVITY_CHANGE");
//        localBroadcastManager.sendBroadcast(intent);

//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("www.google.com"));
//
//        ClassC classC = new ClassC();
//        String i = "e";


//        new ClassB().show();

//        final CustomTextInputLayout tx1, tx2;
//        EditText et1, et2;
//        Button bt, bt1;
//
//        tx1 = findViewById(R.id.tx1);
////        tx2 = findViewById(R.id.tx2);
//        et1 = findViewById(R.id.et1);
////        et2 = findViewById(R.id.et2);
//        bt = findViewById(R.id.bt);
//        bt1 = findViewById(R.id.bt1);
//
//        bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tx1.setError("gap");
//            }
//        });
//
//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tx1.hideError();
//            }
//        });
    }

    private void bindMyService() {
        if(serviceConnection == null){
            serviceConnection = new ServiceConnection() {
                @Override
                public void onServiceConnected(ComponentName name, IBinder service) {
                    MyService1.MyBinder myBinder = (MyService1.MyBinder) service;
                    myService1 = myBinder.getService();
                    serviceConnected = true;
                }

                @Override
                public void onServiceDisconnected(ComponentName name) {
                    serviceConnected = false;
                }
            };
        }
        bindService(intent,serviceConnection,Context.BIND_AUTO_CREATE);
    }

    /**
     *
     *
     * @param a
     * @param b
     * @return
     */

    public int add(int a, int b){
        return a+b;
    }

}
