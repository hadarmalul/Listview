package com.example.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

public class SecondActivity extends AppCompatActivity {
    ListView lv2;
    String[][] country = new String[4][5];
    String c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lv2 = (ListView) findViewById(R.id.lv2);
        Intent gi = getIntent();
        c = gi.getStringExtra("n");

     if(c.equals("asia")){
         country[0][1] = "israel";
         country[0][2] = "china";
         country[0][3] = "japan";
         country[0][4] = "india";
     }

        
    }









}
