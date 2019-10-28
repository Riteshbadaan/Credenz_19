package com.pisb.credenz19;

import androidx.core.content.ContextCompat;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import static com.pisb.credenz19.addreceipts.mydatabase;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.widget.Toolbar;

public class receipt extends optionsmenu {

    public static boolean flag=true,flag1=false;
    public Toolbar toolbar;
    public ListView listView;
    public static ArrayAdapter adapter;
    public static List<String>userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        listView = findViewById(R.id.listview);

        toolbar=findViewById(R.id.myreceipttool);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_vert_black_24dp));
        TextView st=toolbar.findViewById(R.id.texttool);
        st.setText("MY RECEIPTS");
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        mydatabase=this.openOrCreateDatabase("Receipts",MODE_PRIVATE,null);
        Cursor c=mydatabase.rawQuery("SELECT * FROM detailofreceipt",null);
        int idindex=c.getColumnIndex("id");
        int nameindex=c.getColumnIndex("name");
        int eventsindex=c.getColumnIndex("events");
        userlist = new ArrayList<>();
        c.moveToFirst();
        if (c!= null) {

            for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
                String id, n, e;
                id = c.getString(idindex);
                n = c.getString(nameindex);
                e = c.getString(eventsindex);
                Log.i("id",id);

                userlist.add(id+"\nName: "+n+"\nEvents: "+e);
                adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,userlist) {
                    @Override
                    public View getView(int position, View convertView, ViewGroup parent) {

                        View view = super.getView(position, convertView, parent);
                        TextView text = view.findViewById(android.R.id.text1);

                        ViewGroup.LayoutParams params = view.getLayoutParams();
                        params.height =300;                                                                     //view height
                        view.setLayoutParams(params);

                        text.setAlpha(0.88f);
                        if (flag == true) {
                            text.setTextColor(Color.parseColor("#000000"));                                                     //view colour
                        }
                        text.setTextSize(TypedValue.COMPLEX_UNIT_DIP,17);                                   //text size in view
                        text.setGravity(Gravity.LEFT);
                        view.setBackgroundColor(Color.parseColor("#ffffff"));                       //view background

                        ((TextView) view).setGravity(Gravity.CENTER);
                        Animation animation= AnimationUtils.loadAnimation(receipt.this,R.anim.slide_up);
                        view.startAnimation(animation);
                        return view;
                    }
                };
                listView.setAdapter(adapter);
//            mydatabase.execSQL("Delete from detailofreceipt");

            }
        }
    }
}
