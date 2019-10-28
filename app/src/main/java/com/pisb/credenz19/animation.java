package com.pisb.credenz19;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

public class animation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
                final float normalizedposition = Math.abs(Math.abs(position) - 1);
        if(position<-1.0F && position>1.0F)
        {
            page.setScaleX(normalizedposition / 2 + 0.5f);
            page.setScaleY(normalizedposition / 2 + 0.5f);
            page.setAlpha(0.0F);
        }
        else if(position==0.0F)
        {

            page.setScaleX(normalizedposition / 2 + 0.5f);
            page.setScaleY(normalizedposition / 2 + 0.5f);
            page.setAlpha(1.0F);
        }
        else
        {

            page.setScaleX(normalizedposition / 2 + 0.5f);
            page.setScaleY(normalizedposition / 2 + 0.5f);
            page.setAlpha(1-Math.abs(position));
        }
    }
}
