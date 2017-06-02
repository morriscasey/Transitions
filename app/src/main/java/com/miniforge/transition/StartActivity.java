package com.miniforge.transition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void nextActivity(View view){
        Intent intent = new Intent(this, NextActivity.class);
        startActivity(intent);
        // OverridePendingTransition take two parameters. The first is the entering animation, which
        // in this case is NextActivity and the second is the exit animation for StartActivity.
        // See res/anim/ for the xml built
        overridePendingTransition(R.anim.enter_slide_left, R.anim.exit_slide_left);
    }
}
