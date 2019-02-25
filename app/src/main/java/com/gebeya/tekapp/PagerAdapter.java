package com.gebeya.tekapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new fragmentVisit();
            case 1:
                return new fragmentWeather();
            case 2:
                return new fragmentEat();
            case 3:
                return new fragmentShop();
            default:
                return new fragmentGetArea();

        }

    }

    @Override
    public int getCount() {
        return 5;
    }
}
