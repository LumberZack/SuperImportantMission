package com.example.android.superimportantmission;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        final Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeMessage(btn);
            }
        });

        btn.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                changePage(btn);
                return true;
            }
        });
    }

    /** Called when the user clicks the Send button */
    public void changePage(View view) {
        // Select the Activity you wish to open
        Intent intent = new Intent(this, SecondPAge.class);
        startActivity(intent);
    }

    public void changeMessage(View view){
        TextView message = (TextView) findViewById(R.id.fun_text);
        message.setText("poop");
    }
}
