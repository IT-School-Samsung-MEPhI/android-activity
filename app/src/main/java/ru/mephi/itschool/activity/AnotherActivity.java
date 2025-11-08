package ru.mephi.itschool.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/** @noinspection Convert2Lambda*/
public class AnotherActivity extends AppCompatActivity {

    private static final String TAG = "AnotherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Log.d(TAG, "onCreate");

        TextView textViewReceived = findViewById(R.id.text_view_received);
        Button buttonBack = findViewById(R.id.button_back);

        Intent intent = getIntent();
        String receivedText = intent.getStringExtra(MainActivity.EXTRA_INPUT_TEXT);
        if (receivedText != null && !receivedText.isEmpty()) {
            textViewReceived.setText(receivedText);
        }

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}