package com.example.android.superimportantmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FifthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_page);
    }

    public void changePage4(View view){
        Intent intent = new Intent(this, FinalPage.class);
        startActivity(intent);
    }
}
