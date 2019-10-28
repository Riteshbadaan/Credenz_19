package com.pisb.credenz19;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import es.dmoral.toasty.Toasty;

public  class report extends optionsmenu
{
    Toolbar toolbar;
    TextView phone,remail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);
        toolbar=findViewById(R.id.reporttool);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_vert_black_24dp));
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        phone=findViewById(R.id.riteshphone);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri u=Uri.parse("tel:+91 9469087466");
                Intent intent=new Intent(Intent.ACTION_DIAL,u);
                try {
                    startActivity(intent);
                }
                catch (SecurityException e)
                {
                    Toasty.error(report.this, "Calling Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        remail=findViewById(R.id.riteshemail);
        remail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","ritesh.badaan197@gmail.com",null));
                startActivity(intent3);
            }
        });
    }
}
