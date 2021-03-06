package com.part.project.projectsettingspart;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class FullBlockActivity extends AppCompatActivity
{
    Button homeButton;
    boolean createFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_block);
        homeButton = findViewById(R.id.home_button);
        getSupportActionBar().hide();
        createFlag = true;
        homeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent home = new Intent(Intent.ACTION_MAIN);
                home.addCategory(Intent.CATEGORY_HOME);
                home.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(home);
            }
        });
        //setTitle("Oops...");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if (!createFlag)
        {
            finish();
        }
        createFlag = false;
    }
}
