package com.pisb.credenz19;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.appcompat.widget.Toolbar;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import java.io.IOException;
import es.dmoral.toasty.Toasty;


public class addreceiptqrcode extends optionsmenu {

    SurfaceView surfaceView;
    CameraSource cameraSource;
    BarcodeDetector barcodeDetector;
    Toolbar toolbar;
    TextView qrtext;
    String receipt="";

    public DatabaseReference dr;

    public  static SQLiteDatabase mydatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addreceiptqrcode);

        mydatabase=this.openOrCreateDatabase("Receipts",MODE_PRIVATE,null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS detailofreceipt(id VARCHAR,name VARCHAR,events VARCHAR)");
        dr= FirebaseDatabase.getInstance().getReference().child("Events");


        toolbar=findViewById(R.id.receipttool2);
        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_vert_black_24dp));
        TextView st=toolbar.findViewById(R.id.texttool);
        st.setText("ADD RECEIPTS");
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Button btn=findViewById(R.id.qrbutton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(addreceiptqrcode.this,addreceipts.class));
            }
        });


        qrtext=findViewById(R.id.qrtext);
        surfaceView=findViewById(R.id.cameraview);
        barcodeDetector=new BarcodeDetector.Builder(this).setBarcodeFormats(Barcode.QR_CODE ).build();
        cameraSource=new CameraSource.Builder(this, barcodeDetector).setRequestedPreviewSize(640,500).build();

        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback()    {
            @Override
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                if(ActivityCompat.checkSelfPermission(addreceiptqrcode.this, Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
             try {
                 cameraSource.start(surfaceHolder);
             }
             catch (IOException e)
             {
                 e.printStackTrace();
             }
             }

            @Override
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                cameraSource.stop();
            }
        });

        barcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
            @Override
            public void release() {

            }

            @Override
            public void receiveDetections(Detector.Detections<Barcode> detections) {

                final SparseArray<Barcode> qrcodes=detections.getDetectedItems();
                if(qrcodes.size()!=0)
                {

                    qrtext.post(new Runnable() {
                        @Override
                        public void run() {
                            Toasty.success(addreceiptqrcode.this,"Id found ,Check in the My Receipt Section", Toast.LENGTH_SHORT).show();
                             receipt=qrcodes.valueAt(0).displayValue;
                            Query query=dr.orderByChild("receiptno").equalTo(receipt);
                            query.addListenerForSingleValueEvent(valueEventListener);
                            Intent intent=new Intent(addreceiptqrcode.this,Main3Activity.class);
                            startActivity(intent);
                            cameraSource.stop();
                        }
                    });
                }

            }
        });
    }
    ValueEventListener valueEventListener=new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            //userlist.clear();
            if(dataSnapshot.exists())
            {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    participant participant1 = snapshot.getValue(participant.class);
                    //userlist.add(participant1);
                    Log.i("name",participant1.part1);
                    String p1=participant1.receiptno,p2=participant1.part1,p3=participant1.events;
                    mydatabase.execSQL("INSERT INTO detailofreceipt (id,name,events)  VALUES("+"'"+p1+"',"+"'"+p2+"',"+"'"+p3+"'"+")");
                }
            }
            else
                Toasty.info(addreceiptqrcode.this, "Id not found", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    };
}
