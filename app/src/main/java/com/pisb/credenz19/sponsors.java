package com.pisb.credenz19;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

public  class sponsors extends optionsmenu
{
    ListView listView;
    Toolbar toolbar;
    String titles[]={"Title Sponsor","Co-Sponsor","Co-Sponsor","Educational Partner","Educational Partner","Study Abroad Partner","Foreign Language Partner","Energy Partner","Exclusive Event Sponsor","Exclusive Event Sponsor","Food Sponsor","Online Media Partner","Programming Partner","Programming partner"};
    int images[]={R.drawable.finiq,R.drawable.ic_magazine_im_logo,R.drawable.ic_byjus1,R.drawable.ic_collegepond,R.drawable.ic_ims,R.drawable.aarnaelllogo,R.drawable.ic_dd,R.drawable.monster1,R.drawable.ic_s5,R.drawable.ic_gate,R.drawable.chetty1,R.drawable.ic_campus,R.drawable.ic_codechef,R.drawable.ic_kaggle};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sponsor);
        toolbar=findViewById(R.id.sponsortool);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_vert_black_24dp));
        TextView st=toolbar.findViewById(R.id.texttool);
        st.setText("SPONSORS");
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        listView=findViewById(R.id.sponsorlist);
        adapter adapter=new adapter(this,titles,images);
        listView.setAdapter(adapter);

    }
    class adapter extends ArrayAdapter<String>
    {

        Context context;
        String atitles[];
        int aimages[];

        public adapter(Context c, String at[],int ai[]) {
            super(c,R.layout.sponsorlist,R.id.sponsortextview,at);
            this.context=c;
            this.atitles=at;
            this.aimages=ai;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater=(LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View sponsorview=inflater.inflate(R.layout.sponsorlist,parent,false);
            TextView sponsortextview=sponsorview.findViewById(R.id.sponsortextview);
            ImageView sponsorimageview=sponsorview.findViewById(R.id.sponsorimagview);

            sponsortextview.setText(atitles[position]);
            sponsorimageview.setImageResource(aimages[position]);

            Animation animation= AnimationUtils.loadAnimation(context,R.anim.slide_up);
            sponsorview.startAnimation(animation);

            return sponsorview;
        }
    }
}