package com.example.android.superimportantmission;

import android.content.Intent;
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

    public void startTimer(final View view){
        final TextView count = (TextView) findViewById(R.id.countTimer);
        CountDownTimer timer = new CountDownTimer(8000, 1000) {

            public void onTick(long millisUntilFinished) {
                count.setText(millisUntilFinished / 1000 + " seconds CHG TIME");
            }

            public void onFinish() {
                changePage3(view);
            }
        };
        timer.start();
    }

    public void changePage3(View view){
        Intent intent = new Intent(this, FifthPage.class);
        startActivity(intent);
    }

}
