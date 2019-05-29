package com.example.mohammad.assignmenttwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class showactivity extends AppCompatActivity {

    EditText firstname,lastname;
    DatePicker dp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showactivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        firstname = (EditText)findViewById(R.id.first);
        lastname = (EditText)findViewById(R.id.last);
        dp = (DatePicker) findViewById(R.id.dp);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String firstnname  = firstname.getText().toString();
                String lastnname  = lastname.getText().toString();
                int  dpyear = dp.getYear();
                int  dpday = dp.getDayOfMonth();
                int  dpmonth = dp.getMonth();
                Snackbar.make(view, "Done ", Snackbar.LENGTH_LONG)
                        .setAction("", null).show();


                Intent introIntent = new Intent(getApplicationContext(), MainActivity.class);
                introIntent.putExtra("ffff", firstnname);
                introIntent.putExtra("llll", lastnname);
                introIntent.putExtra("yyyy", dpyear);
                introIntent.putExtra("mmmm", dpmonth);
                introIntent.putExtra("dddd", dpday);


                startActivity(introIntent);
                finish();
            }
        });



    }

}
