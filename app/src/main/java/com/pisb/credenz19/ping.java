package com.pisb.credenz19;

import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

public  class ping extends optionsmenu
{
    Toolbar toolbar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ping);

        toolbar=findViewById(R.id.pingtool);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_vert_black_24dp));
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        TextView t12=findViewById(R.id.pingtext);
        t12.setText("PICT IEEE Newsletter Group (P.I.N.G.), the official " +
                "newsletter of PISB, is a biannual technical magazine. " +
                "An edition of P.I.N.G., Issue 14.1 was published during Credenz. " +
                "Over the years, success of P.I.N.G. as a truly professional and " +
                "insightful technical magazine has risen and has reached overseas as well.\n\n" +
                "P.I.N.G. is made by a group of zesty individuals, driven by a common purpose " +
                "of reflecting the youth's insight on advancements in technology. It showcases a" +
                " diverse array of topics right from quantum physics to biotechnology thus thrilling " +
                "readers with its vast expanse of coverage.\n\n" +
                " Over the years, P.I.N.G. has been appreciated by students, teachers and " +
                "technical personnel. The contribution of the authors, the suggestions of the readers " +
                "and the guidance by fellow PISB members have made it possible for successive P.I.N.G. " +
                "issues to be recognized as a valuable contribution to the technical society. The members " +
                "of PISB aspire for P.I.N.G. to be a world-class magazine and achieve new heights in the subsequent years.");

        final TextView mail=findViewById(R.id.pingmail);

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mail.setText("https://issuu.com/p.i.n.g./docs/2-5");
                Linkify.addLinks(mail, Linkify.WEB_URLS);
            }
        });


    }
}