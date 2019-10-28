package com.pisb.credenz19;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Pageviewadapter extends FragmentPagerAdapter {
    public Pageviewadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        Fragment fragment=null;
        switch(position)
        {
            case 0:fragment=new card1intro();
                break;
            case 1:fragment=new card1rules();
                break;
            case 2:fragment=new card1structure();
                break;
            case 3:fragment=new card1judging();
                break;
            case 4:fragment=new card1contact();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
