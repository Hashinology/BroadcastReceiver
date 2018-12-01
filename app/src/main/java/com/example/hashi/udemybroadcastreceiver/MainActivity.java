package com.example.hashi.udemybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendBroadcastMessage(View view)
    {
        //define Explicit Intent
        //Intent intent = new Intent(this, myBroadcastReceiver.class);
        //define implicit Intent
        Intent intent = new Intent("my.custom.action.name");
        sendBroadcast(intent);

        Toast.makeText(this, "This is After sending the Recevier!!", Toast.LENGTH_SHORT).show();
    }

    public void broadcastToInnerReceiver(View view) {
       // Intent intent = new Intent(this, myBroadcastReceiver.class);
       // Intent intent = new Intent("my_custom_another_action_name");
       // sendBroadcast(intent);
    }

    public static class ThirdBroadcastInner extends BroadcastReceiver
    {
        private static final String TAG = ThirdBroadcastInner.class.getSimpleName();

        @Override
        public void onReceive(Context context, Intent intent)
        {
            Log.i(TAG,"Third Receiver" );
            Toast.makeText(context, "This is from Third Receiver", Toast.LENGTH_SHORT).show();
        }
    }
}
