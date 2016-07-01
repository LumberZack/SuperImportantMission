package com.example.android.superimportantmission;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FourthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);
    }

    TextView count = (TextView) findViewById(R.id.countTimer);

    public void startTimer(View view){
        CountDownTimer timer = new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                count.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                count.setText("done!");
            }
        }.start();
    }

}
