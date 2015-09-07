package com.project1985michel.menu2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs

        TextView firstTV = (TextView) findViewById(R.id.menu_item_1);
        String item1 = firstTV.getText().toString();
        Log.v("MainAcctivity",item1);


        // Find second menu item TextView and print the text to the logs

        TextView secundTV = (TextView) findViewById(R.id.menu_item_2);
        String item2 = secundTV.getText().toString();
        Log.v("MainAcctivity",item2);

        // Find third menu item TextView and print the text to the logs

        TextView thirdTV = (TextView) findViewById(R.id.menu_item_3);
        String item3 = thirdTV.getText().toString();
        Log.v("MainAcctivity",item3);

    }
}