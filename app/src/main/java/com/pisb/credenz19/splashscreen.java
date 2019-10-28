package com.pisb.credenz19;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;



public class splashscreen extends optionsmenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this,Main3Activity.class);
                startActivity(intent);
                Animatoo.animateZoom(splashscreen.this);
            }
        },4000);
    }
}
