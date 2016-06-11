package com.example.user_1.loker_practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;


public class AppReserveActivity extends AppCompatActivity {
    ImageButton btnselect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_reserve);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnselect = (ImageButton) findViewById(R.id.btnselect);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
    /*public boolean onTouchEvent(MotionEvent event){
        if(event.getAction()==MotionEvent.ACTION_DOWN){

            btnselect.setImageResource(R.drawable.btn_select_2);
            //btnselect.setImageDrawable(R.drawable.btn_select_2);
        }
        return false;
    }*/

    public void selectOnClick(View v) {
        // move to reserve_select
        //SetTouchHandler(v);
        Intent intentSubActivity=new Intent(AppReserveActivity.this, AppListActivity.class);
        startActivity(intentSubActivity);
    }

    public void changeOnClick(View v) {
        // move to reserve_change
        //Intent intentSubActivity=new Intent(AppReserveActivity.this,AppListActivity.class);
        //startActivity(intentSubActivity);
    }
    public void unlockOnClick(View v) {
        // move to reserve_unlock
        //Intent intentSubActivity=new Intent(AppReserveActivity.this,AppListActivity.class);
        //startActivity(intentSubActivity);
    }


}
