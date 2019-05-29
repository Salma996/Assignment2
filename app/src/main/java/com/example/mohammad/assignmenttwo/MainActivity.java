package com.example.mohammad.assignmenttwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView firstm,lastn,dp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstm = (TextView)findViewById(R.id.first);
        lastn = (TextView)findViewById(R.id.last);
        dp = (TextView)findViewById(R.id.date);
        Intent getter =  getIntent();
        String thefirst = getIntent().getStringExtra("ffff");
        String thelast = getIntent().getStringExtra("llll");
        String year = String.valueOf(getIntent().getIntExtra("yyyy",1998));
        String month = String.valueOf(getIntent().getIntExtra("mmmm",1998));
        String day = String.valueOf(getIntent().getIntExtra("dddd",1998));
        System.out.println(thefirst);


       firstm.setText(thefirst);
        lastn.setText(thelast);
        dp.setText(year + "-" + month + "-" + day);





    }
}
