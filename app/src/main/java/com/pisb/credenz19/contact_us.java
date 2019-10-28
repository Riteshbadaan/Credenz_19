package com.pisb.credenz19;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

public  class contact_us extends optionsmenu
{
    Toolbar toolbar;
    TextView phone1,phone2,pisbemail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
        toolbar=findViewById(R.id.contacttool);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_vert_black_24dp));
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        phone1=findViewById(R.id.phone1);
        phone2=findViewById(R.id.phone2);
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri u=Uri.parse("tel:+91 7798401391");
                Intent intent1=new Intent(Intent.ACTION_DIAL,u);
                startActivity(intent1);
            }
        });
        phone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri u1=Uri.parse("tel:+91 8999412539");
                Intent intent2=new Intent(Intent.ACTION_DIAL,u1);
                startActivity(intent2);
            }
        });
        pisbemail=findViewById(R.id.pisbemail);
        pisbemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","pisb.credenz@gmail.com",null));
                startActivity(intent3);
            }
        });
    }
}