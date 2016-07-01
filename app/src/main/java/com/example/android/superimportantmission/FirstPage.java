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
        counter = 0;
        TextView message = (TextView) findViewById(R.id.fun_text);
        message.setText("");
    }

    int counter = 0;

    public void changeMessage(View view){
        TextView message = (TextView) findViewById(R.id.fun_text);
        counter = counter + 1;
        if (counter == 1){
            message.setText("Hint: Don't push the button.");
        }
        else if (counter == 2){
            message.setText("Hint:Try looking in the living room.");
        }
        else if (counter == 3){
            message.setText("Really?");
        }
        else if (counter == 4){
            message.setText("Cmon baby. Read the main clue again.");
        }
        else if (counter == 5){
            message.setText("Okay last hint: Painting.");
        }
        else if (counter == 6) {
            message.setText("Seriously, that's all I got.");
        }
        else if (counter == 7) {
            message.setText("This isn't a game.");
        }
        else if (counter == 8) {
            message.setText("Stop pushing the button.");
        }
        else if (counter == 9) {
            message.setText("This will get you no where.");
        }
        else if (counter == 10){
            message.setText("Now you're just wasting time...");
        }
        else if (counter == 15) {
            message.setText("Behind the painting...");
        }
        else if (counter == 20){
            message.setText("...");
        }
    }
}
