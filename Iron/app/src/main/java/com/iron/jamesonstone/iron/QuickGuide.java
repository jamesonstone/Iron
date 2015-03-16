package com.iron.jamesonstone.iron;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jamesonstone on 3/15/15.
 */
public class QuickGuide extends Activity {


    protected void onCreate(Bundle savedInstanceState){
        Intent i = getIntent();
        String hello = "HELLO WORLD";

        TextView tv = new TextView(this);
        tv.setTextSize(40);
        tv.setText(hello);


        setContentView(tv);


    }



}
