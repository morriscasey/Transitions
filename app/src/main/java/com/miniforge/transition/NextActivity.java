package com.miniforge.transition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        // Get intent
        Intent intent = getIntent();

    }

    public void previousActivity(View view){
        Intent intent = new Intent(this,StartActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_slide_right,R.anim.exit_slide_right);

    }
}
