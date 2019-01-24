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
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_block);
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        homeButton = findViewById(R.id.home_button);
        getSupportActionBar().hide();
        homeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                v.startAnimation(animAlpha);
                Intent home = new Intent(Intent.ACTION_MAIN);
                home.addCategory(Intent.CATEGORY_HOME);
                home.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(home);
            }
        });
        //setTitle("Oops...");
    }
}
