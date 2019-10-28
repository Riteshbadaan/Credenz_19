package com.pisb.credenz19;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;
import es.dmoral.toasty.Toasty;
import static com.pisb.credenz19.addreceiptqrcode.mydatabase;


public class Main3Activity extends optionsmenu implements NavigationView.OnNavigationItemSelectedListener {

    private int code=1;
    static int a=1;
    static Toolbar toolbar;
    static int eventno=0;
    boolean exit=false;
    ScrollView scrollView;
    ImageView firstimg,secondimg,thirdimg,firstimg2,secondimg2,thirdimg2,fourthimg2,fifthimg2,sixthimg2,firstimg3,secondimg3,thirdimg3,firstimg5,secondimg5,thirdimg5,firstimg7,secondimg7,thirdimg7,firstimg9,secondimg9,thirdimg9;
    float translatex,translatey;
    String []permission={Manifest.permission.CAMERA};
    CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,cardView11,cardView12,cardView13,cardView14,cardView15;
    Context context=Main3Activity.this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar=findViewById(R.id.custtool);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        if(ContextCompat.checkSelfPermission(Main3Activity.this, permission[0])!= PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(Main3Activity.this,permission,code);
        }
        mydatabase=this.openOrCreateDatabase("Receipts",MODE_PRIVATE,null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS detailofreceipt(id VARCHAR,name VARCHAR,events VARCHAR)");

        toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_more_vert_black_24dp));
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowTitleEnabled(false);
         DrawerLayout drawer= findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        scrollView=findViewById(R.id.scroll);


        DisplayMetrics displayMetrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        translatex=displayMetrics.widthPixels*0.050f;
        translatey=displayMetrics.heightPixels*0.020f;

        cardView1=findViewById(R.id.card1);
        cardView2=findViewById(R.id.card2);
        cardView3=findViewById(R.id.card3);
        cardView4=findViewById(R.id.card4);
        cardView5=findViewById(R.id.card5);
        cardView6=findViewById(R.id.card6);
        cardView7=findViewById(R.id.card7);
        cardView8=findViewById(R.id.card8);
        cardView9=findViewById(R.id.card9);
        cardView10=findViewById(R.id.card10);
        cardView11=findViewById(R.id.card11);
        cardView12=findViewById(R.id.card12);
        cardView13=findViewById(R.id.card13);
        cardView14=findViewById(R.id.card14);
        cardView15=findViewById(R.id.card15);

        firstimg=findViewById(R.id.firstimg);
        secondimg=findViewById(R.id.secondimg);
        thirdimg=findViewById(R.id.thirdimg);

        firstimg2=findViewById(R.id.first2img);
        secondimg2=findViewById(R.id.second2img);
        thirdimg2=findViewById(R.id.third2img);
        fourthimg2=findViewById(R.id.fourth2img);
        fifthimg2=findViewById(R.id.fifth2img);
        sixthimg2=findViewById(R.id.sixth2img);
        firstimg3=findViewById(R.id.first3img);
        secondimg3=findViewById(R.id.second3img);
        thirdimg3=findViewById(R.id.third3img);

        firstimg5=findViewById(R.id.first5img);
        secondimg5=findViewById(R.id.second5img);
        thirdimg5=findViewById(R.id.third5img);

        firstimg7=findViewById(R.id.first7img);
        secondimg7=findViewById(R.id.second7img);
        thirdimg7=findViewById(R.id.third7img);

        firstimg9=findViewById(R.id.first9img);
        secondimg9=findViewById(R.id.second9img);
        thirdimg9=findViewById(R.id.third9img);


        firstimg.setImageResource(R.drawable.amin1);
        secondimg.setImageResource(R.drawable.amin1);
        thirdimg.setImageResource(R.drawable.amin1);

        firstimg2.setImageResource(R.drawable.amin1);
        secondimg2.setImageResource(R.drawable.amin1);
        thirdimg2.setImageResource(R.drawable.amin1);
        fourthimg2.setImageResource(R.drawable.amin1);
        fifthimg2.setImageResource(R.drawable.amin1);
        sixthimg2.setImageResource(R.drawable.amin1);
        firstimg3.setImageResource(R.drawable.amin1);
        secondimg3.setImageResource(R.drawable.amin1);
        thirdimg3.setImageResource(R.drawable.amin1);

        firstimg5.setImageResource(R.drawable.amin1);
        secondimg5.setImageResource(R.drawable.amin1);
        thirdimg5.setImageResource(R.drawable.amin1);

        firstimg7.setImageResource(R.drawable.amin1);
        secondimg7.setImageResource(R.drawable.amin1);
        thirdimg7.setImageResource(R.drawable.amin1);

        firstimg9.setImageResource(R.drawable.amin1);
        secondimg9.setImageResource(R.drawable.amin1);
        thirdimg9.setImageResource(R.drawable.amin1);


        animation();


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=1;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=2;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=3;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=4;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=5;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=6;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=7;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=8;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=9;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=10;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=11;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=12;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=13;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=14;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
        cardView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,eventdetail1.class);
                eventno=15;
                startActivity(intent);
                Animatoo.animateSwipeLeft(Main3Activity.this);
            }
        });
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(Gravity.LEFT)) {

                drawer.closeDrawer(Gravity.LEFT);

                exit = false;

            } else {
                if (context == Main3Activity.this) {
                    if(a==1) {
                        if (exit) {
                            super.onBackPressed();
                            finishAffinity();
                            finish();
                            return;
                        }
                        this.exit = true;
                        Toasty.info(this, "Press back again to exit", Toast.LENGTH_SHORT).show();

                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                exit = false;
                            }
                        }, 3000);
                    }
                    else
                    {
                        super.onBackPressed();
                        a=1;
                    }
                }
            }
        }


        void animation()
        {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    final AnimationDrawable animation= (AnimationDrawable) firstimg.getDrawable();
                    final AnimationDrawable animation2= (AnimationDrawable) secondimg.getDrawable();
                    final AnimationDrawable animation3= (AnimationDrawable) thirdimg.getDrawable();

                    final AnimationDrawable animation5= (AnimationDrawable) firstimg2.getDrawable();
                    final AnimationDrawable animation6= (AnimationDrawable) secondimg2.getDrawable();
                    final AnimationDrawable animation7= (AnimationDrawable) thirdimg2.getDrawable();
                    final AnimationDrawable animation8= (AnimationDrawable) fourthimg2.getDrawable();
                    final AnimationDrawable animation30= (AnimationDrawable) fifthimg2.getDrawable();
                    final AnimationDrawable animation40= (AnimationDrawable) sixthimg2.getDrawable();
                    final AnimationDrawable animation9= (AnimationDrawable) firstimg3.getDrawable();
                    final AnimationDrawable animation10= (AnimationDrawable) secondimg3.getDrawable();
                    final AnimationDrawable animation11= (AnimationDrawable) thirdimg3.getDrawable();

                    final AnimationDrawable animation13= (AnimationDrawable) firstimg5.getDrawable();
                    final AnimationDrawable animation14= (AnimationDrawable) secondimg5.getDrawable();
                    final AnimationDrawable animation15= (AnimationDrawable) thirdimg5.getDrawable();

                    final AnimationDrawable animation17= (AnimationDrawable) firstimg7.getDrawable();
                    final AnimationDrawable animation18= (AnimationDrawable) secondimg7.getDrawable();
                    final AnimationDrawable animation19= (AnimationDrawable) thirdimg7.getDrawable();

                    final AnimationDrawable animation21= (AnimationDrawable) firstimg9.getDrawable();
                    final AnimationDrawable animation22= (AnimationDrawable) secondimg9.getDrawable();
                    final AnimationDrawable animation23= (AnimationDrawable) thirdimg9.getDrawable();


                    animation.start();animation2.start();animation3.start();//animation4.start();
                    animation5.start();animation6.start();animation7.start();
                    animation8.start();animation30.start();animation40.start();
                    animation9.start();animation10.start();animation11.start();

                    animation13.start();animation14.start();animation15.start();

                    animation17.start();animation18.start();animation19.start();

                    animation21.start();animation22.start();animation23.start();


                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            animation.stop();animation2.stop();animation3.stop();

                            animation5.stop();animation6.stop();animation7.stop();
                            animation8.stop();animation30.stop();animation40.stop();
                            animation9.stop();animation10.stop();animation11.stop();

                            animation13.stop();animation14.stop();animation15.stop();

                            animation17.stop();animation18.stop();animation19.stop();

                            animation21.stop();animation22.stop();animation23.stop();

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    final Animation animation1=new TranslateAnimation(0,translatex,0,0);
                                    Animation animation2=new TranslateAnimation(0,-translatex,0,0);
                                    animation1.setDuration(600);
                                    animation1.setFillAfter(true);
                                    animation2.setDuration(600);
                                    animation2.setFillAfter(true);
                                    cardView1.startAnimation(animation1);
                                    cardView2.startAnimation(animation2);


                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            Animation animation3=new TranslateAnimation(0,translatex,0,0);
                                            Animation animation4=new TranslateAnimation(0,-translatex,0,0);
                                            animation3.setDuration(300);
                                            animation3.setFillAfter(true);
                                            animation4.setDuration(300);
                                            animation4.setFillAfter(true);
                                            cardView4.startAnimation(animation3);
                                            cardView5.startAnimation(animation4);


                                            new Handler().postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    Animation animation3=new TranslateAnimation(0,translatex,0,0);
                                                    Animation animation4=new TranslateAnimation(0,-translatex,0,0);
                                                    animation3.setDuration(300);
                                                    animation3.setFillAfter(true);
                                                    animation4.setDuration(300);
                                                    animation4.setFillAfter(true);
                                                    cardView7.startAnimation(animation3);
                                                    cardView8.startAnimation(animation4);

                                                    new Handler().postDelayed(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            Animation animation3=new TranslateAnimation(0,translatex,0,0);
                                                            Animation animation4=new TranslateAnimation(0,-translatex,0,0);
                                                            animation3.setDuration(300);
                                                            animation3.setFillAfter(true);
                                                            animation4.setDuration(300);
                                                            animation4.setFillAfter(true);
                                                            cardView10.startAnimation(animation3);
                                                            cardView11.startAnimation(animation4);

                                                            new Handler().postDelayed(new Runnable() {
                                                                @Override
                                                                public void run() {
                                                                    Animation animation3=new TranslateAnimation(0,translatex,0,0);
                                                                    Animation animation4=new TranslateAnimation(0,-translatex,0,0);
                                                                    animation3.setDuration(300);
                                                                    animation3.setFillAfter(true);
                                                                    animation4.setDuration(300);
                                                                    animation4.setFillAfter(true);
                                                                    cardView13.startAnimation(animation3);
                                                                    cardView14.startAnimation(animation4);

                                                                }
                                                            },400);
//
                                                        }
                                                    },400);
                                                }
                                            },400);
                                        }
                                    },400);
                                }
                            },400);
                        }
                    },1000);
                }
            },600);
        }
    @SuppressWarnings("StatementWithEmptyBody")
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment=null;

        if(id==R.id.addreceipt)
        {
            startActivity(new Intent(Main3Activity.this,addreceiptqrcode.class));
            Animatoo.animateSwipeLeft(Main3Activity.this);
        }
        else if (id == R.id.myreceipt) {
            startActivity(new Intent(Main3Activity.this,receipt.class));
            Animatoo.animateSwipeLeft(Main3Activity.this);
        }
        else if (id == R.id.ping) {
            startActivity(new Intent(Main3Activity.this,ping.class));
            Animatoo.animateSwipeLeft(Main3Activity.this);
        } else if (id == R.id.sponsors) {
            startActivity(new Intent(Main3Activity.this,sponsors.class));
            Animatoo.animateSwipeLeft(Main3Activity.this);
        } else if (id == R.id.about) {
            startActivity(new Intent(Main3Activity.this,about_us.class));
            Animatoo.animateSwipeLeft(Main3Activity.this);
        } else if (id == R.id.contact) {
            startActivity(new Intent(Main3Activity.this,contact_us.class));
            Animatoo.animateSwipeLeft(Main3Activity.this);
        } else if (id == R.id.report) {
            startActivity(new Intent(Main3Activity.this,report.class));
            Animatoo.animateSwipeLeft(Main3Activity.this);
        }
        else if (id == R.id.face) {
            Intent intent=getOpenFacebookIntent(Main3Activity.this);
            startActivity(intent);
        } else if (id == R.id.tweet) {
            Intent intent1 = null;
            try {
                this.getPackageManager().getPackageInfo("com.twitter.android", 0);
                intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=2490234709"));
                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            } catch (Exception e) {
                intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/pisbcredenz"));
            }
            this.startActivity(intent1);
        } else if (id == R.id.insta) {
            Uri uri = Uri.parse("http://instagram.com/pisbcredenz?igshid=x0lsezmicly5");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.instagram.android");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://instagram.com/pisbcredenz")));
            }
        }
        if(fragment!=null)
        {
            FragmentManager fm=getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.container,fragment).commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public static Intent getOpenFacebookIntent(Context context) {
        try{
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/1469705823269256"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pisbcredenz"));
        }
    }
}
