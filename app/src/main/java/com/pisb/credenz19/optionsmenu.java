package com.pisb.credenz19;

import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class optionsmenu extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main2,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        } else if (item.getItemId() == R.id.privacypolicy) {
            Uri uri = Uri.parse("https://docs.google.com/document/d/e/2PACX-1vTuANVIPz1UHrr8jhPJmpCO7nzKi-c63XqVa_qX3EPmy6z9wTQKrshAEIPIM_Qn0Qgm5bVT8B5saG2F/pub"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
