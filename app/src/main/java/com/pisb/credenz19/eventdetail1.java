package com.pisb.credenz19;

import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.widget.Toolbar;
import static com.pisb.credenz19.Main3Activity.eventno;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class eventdetail1 extends optionsmenu {


    ImageView dot1,dot2,dot3,dot4,dot5;
    ViewPager viewPager;
    Pageviewadapter pageviewadapter;
    Toolbar toolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventdetail1);

        toolbar1=findViewById(R.id.eventdetailtool1);
        toolbar1.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_vert_black_24dp));
        TextView t=toolbar1.findViewById(R.id.texttool);
        setSupportActionBar(toolbar1);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        if(eventno==1) {
            t.setText("B-PLAN");
            t.setTransitionName("bplantext");
        }
        else if(eventno==2)
        {
            t.setText("CONTRAPTION");
            t.setTransitionName("contraptiontext");
        }
        else if(eventno==3)
        {
            t.setText("CLASH");
            t.setTransitionName("clashtext");
        }
        else if(eventno==4)
        {
            t.setText("CRETRONIX");
            t.setTransitionName("cretronixtext");
        }
        else if(eventno==5)
        {
            t.setText("NTH");
            t.setTransitionName("nthtext");
        }
        else if(eventno==6)
        {
            t.setText("ENIGMA");
            t.setTransitionName("enigmatext");
        }
        else if(eventno==7)
        {
            t.setText("QUIZ");
            t.setTransitionName("quiztext");
        }
        else if(eventno==8)
        {
            t.setText("PIXELATE");
            t.setTransitionName("pixelatetext");
        }
        else if(eventno==9)
        {
            t.setText("ROBOLIGA");
            t.setTransitionName("roboligatext");
        }
        else if(eventno==10)
        {
            t.setText("WALLSTREET");
            t.setTransitionName("wallstreettext");
        }
        else if(eventno==11)
        {
            t.setText("XODIA");
            t.setTransitionName("xodiatext");
        }
        else if(eventno==12)
        {
            t.setText("PAPER PRESENTATION");
            t.setTransitionName("papertext");
        }
        else if(eventno==13)
        {
            t.setText("RC");
            t.setTransitionName("rctext");
        }
        else if(eventno==14)
        {
            t.setText("DATAWIZ");
            t.setTransitionName("datawiztext");
        }
        else if(eventno==15)
        {
            t.setText("WEB WEAVER");
            t.setTransitionName("webtext");
        }
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        dot1=findViewById(R.id.card1img1);
        dot2=findViewById(R.id.card1img2);
        dot3=findViewById(R.id.card1img3);
        dot4=findViewById(R.id.card1img4);
        dot5=findViewById(R.id.card1img5);

        viewPager=findViewById(R.id.card1viewpager);
        pageviewadapter=new Pageviewadapter(getSupportFragmentManager());
        viewPager.setPageTransformer(false,new animation());
        viewPager.setAdapter(pageviewadapter);

        dot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });

        dot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });
        dot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });
        dot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(3);
            }
        });
        dot5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(4);
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                change(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    private void change(int position)
    {
        ViewGroup.LayoutParams img1para=dot1.getLayoutParams();
        ViewGroup.LayoutParams img2para=dot2.getLayoutParams();
        ViewGroup.LayoutParams img3para=dot3.getLayoutParams();
        ViewGroup.LayoutParams img4para=dot4.getLayoutParams();
        ViewGroup.LayoutParams img5para=dot5.getLayoutParams();

        if(position==0)
        {
            img1para.width=45;
            img2para.width=20;
            img3para.width=20;
            img4para.width=20;
            img5para.width=20;

            dot1.setLayoutParams(img1para);
            dot2.setLayoutParams(img2para);
            dot3.setLayoutParams(img3para);
            dot4.setLayoutParams(img4para);
            dot5.setLayoutParams(img5para);
        }
        else if(position==1)
        {

            img1para.width=20;
            img2para.width=45;
            img3para.width=20;
            img4para.width=20;
            img5para.width=20;

            dot1.setLayoutParams(img1para);
            dot2.setLayoutParams(img2para);
            dot3.setLayoutParams(img3para);
            dot4.setLayoutParams(img4para);
            dot5.setLayoutParams(img5para);

        }
        else if(position==2)
        {
            img1para.width=20;
            img2para.width=20;
            img3para.width=45;
            img4para.width=20;
            img5para.width=20;

            dot1.setLayoutParams(img1para);
            dot2.setLayoutParams(img2para);
            dot3.setLayoutParams(img3para);
            dot4.setLayoutParams(img4para);
            dot5.setLayoutParams(img5para);
        }
        else if(position==3)
        {
            img1para.width=20;
            img2para.width=20;
            img3para.width=20;
            img4para.width=45;
            img5para.width=20;

            dot1.setLayoutParams(img1para);
            dot2.setLayoutParams(img2para);
            dot3.setLayoutParams(img3para);
            dot4.setLayoutParams(img4para);
            dot5.setLayoutParams(img5para);
        }
        else if(position==4)
        {
            img1para.width=20;
            img2para.width=20;
            img3para.width=20;
            img4para.width=20;
            img5para.width=45;

            dot1.setLayoutParams(img1para);
            dot2.setLayoutParams(img2para);
            dot3.setLayoutParams(img3para);
            dot4.setLayoutParams(img4para);
            dot5.setLayoutParams(img5para);
        }
    }
}
