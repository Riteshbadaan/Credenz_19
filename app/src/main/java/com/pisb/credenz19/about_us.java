package com.pisb.credenz19;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

public  class about_us extends optionsmenu
{
    Toolbar toolbar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        toolbar=findViewById(R.id.aboutttool);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_vert_black_24dp));
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        TextView t987=findViewById(R.id.abouttext);
        t987.setText("Credenz is the annual technical festival organised by the PICT " +
                "IEEE Student Branch. Started in 2004, with a view to elicit " +
                "the best out of each and every one, it has grown to become one " +
                "of the finest technical events in Pune. Credenz aims not only to " +
                "infuse a competitive spirit among participants, but also widen their " +
                "horizons in the ever-changing field of technology via myriad seminars " +
                "and workshops. Participants get a chance to discover their talents " +
                "and thrive in numerous events like Clash, B Plan, RoboLIGA, WebWeaver, " +
                "Pixelate, Cretronix, Paper Presentation and DataWiz. This is a unique " +
                "chance for the students to go beyond the traditional spheres of academics " +
                "and make the most of their potential. This spirit of learning and " +
                "discovery has inspired the PICT IEEE Student Branch to present Credenz ‘19, " +
                "a podium for you to nurture and cultivate your talents.");
    }
}