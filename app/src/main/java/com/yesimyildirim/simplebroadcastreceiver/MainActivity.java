package com.yesimyildirim.simplebroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void InnerClassButton(View view) {
        Intent intent = new Intent(this,BroadcastingInnerClass.class);
        sendBroadcast(intent);
    }

    public void broadcastClassButton (View view) {

        Intent intent = new Intent(this,BroadcastingClass.class);
        sendBroadcast(intent);
    }


    public static class BroadcastingInnerClass extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {

            Toast.makeText(context,"Inner Class Broadcast",Toast.LENGTH_LONG).show();

        }
    }
}