package com.pisb.credenz19;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import es.dmoral.toasty.Toasty;

public class addreceipts extends optionsmenu {

    public Toolbar toolbar;
    public TextView receipt1;
    public Button btn;
    public static String receipt="";
    public DatabaseReference dr;
    public  static SQLiteDatabase mydatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addreceipts);


        toolbar=findViewById(R.id.addreceipttool);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_vert_black_24dp));
        TextView st=toolbar.findViewById(R.id.texttool);
        st.setText("ADD RECEIPTS");
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        mydatabase=this.openOrCreateDatabase("Receipts",MODE_PRIVATE,null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS detailofreceipt(id VARCHAR,name VARCHAR,events VARCHAR)");

        receipt1=findViewById(R.id.receiptid1);
        btn=findViewById(R.id.receiptbutton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                receipt="CREDENZ-2K19";
                receipt=receipt+"-"+receipt1.getText().toString().trim();
                dr= FirebaseDatabase.getInstance().getReference().child("Events");
                Query query=dr.orderByChild("receiptno").equalTo(receipt);
                query.addListenerForSingleValueEvent(valueEventListener);
            }
        });
    }
    ValueEventListener valueEventListener=new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            if(dataSnapshot.exists())
            {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    participant participant1 = snapshot.getValue(participant.class);
                    Log.i("name",participant1.part1);
                    String p1=participant1.receiptno,p2=participant1.part1,p3=participant1.events;

                    mydatabase.execSQL("INSERT INTO detailofreceipt (id,name,events)  VALUES("+"'"+p1+"',"+"'"+p2+"',"+"'"+p3+"'"+")");
                    Intent intent=new Intent(addreceipts.this,Main3Activity.class);
                    startActivity(intent);
                }
                Toasty.success(addreceipts.this, "Id found, Check in the My Receipt Section", Toast.LENGTH_SHORT).show();
            }
            else
                Toasty.error(addreceipts.this, "Id not found", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    };
}
