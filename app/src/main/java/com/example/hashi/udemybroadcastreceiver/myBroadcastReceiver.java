package com.example.hashi.udemybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class myBroadcastReceiver extends BroadcastReceiver
    {
        private static final String TAG = myBroadcastReceiver.class.getSimpleName();

        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i(TAG,"this is my first receiver");
            Toast.makeText(context, "Hello you see now the First Receiver", Toast.LENGTH_SHORT).show();
        }
    }
