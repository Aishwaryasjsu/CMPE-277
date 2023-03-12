package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.androidactivitylifecycle.MainActivity;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;


public class ActivityB extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
    @Override
    protected void onStart() {
        super.onStart();

    }
    @Override
    protected void onResume() {
        super.onResume();

    }
    @Override
    protected void onPause() {
        super.onPause();

    }
    @Override
    protected void onStop() {
        super.onStop();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
    @Override
    protected void onRestart() {


        super.onRestart();
        MainActivity.threadCounter += 1;


    }

    public void close(View view) {
        onDestroy();
        onBackPressed();

    }







    public void onFinishActivityB(View view) {
        finish();
    }}
