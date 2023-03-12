package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int threadCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Main after restart"+threadCounter);
        threadCounter += 1;

        TextView threadCounterText = findViewById(R.id.thread_counter_txt);
        System.out.println("Main after inc"+threadCounter);
        threadCounterText.setText("ThreadCounter: " + String.valueOf(threadCounter));
    }

    public void onStartActivityB (View view) {
        Intent activityBIntent = new Intent(MainActivity.this, ActivityB.class);
        startActivity(activityBIntent);
    }

    public void onTriggerDialog (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Dialog")
                .setMessage("Hello from Aishwarya")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                })
                .show();
    }

    public void onCloseApp (View view) {
        finish();
        System.exit(0);
    }
}