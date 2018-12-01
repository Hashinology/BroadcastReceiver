package com.example.hashi.udemybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class mySecondreceiver extends BroadcastReceiver
    {
        private static final String TAG = mySecondreceiver.class.getSimpleName();

        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i(TAG,"Second Receiver" );
            Toast.makeText(context, "This is from Second Receiver", Toast.LENGTH_SHORT).show();

        }
    }
