package com.example.android.superimportantmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class SecondPAge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }

    public void testInput(View view){
        EditText inputText = (EditText) findViewById(R.id.editText1);
        String str = inputText.getText().toString();
        System.out.println(inputText);
        Intent intent = new Intent(this, ThirdPage.class);

        if (str.equals("BIBI")){
            startActivity(intent);
        }
    }
}
