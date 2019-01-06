package com.example.angelo.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Angelo on 21-Dec-18.
 */

class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    PageAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new PersonalInfoFragment();

            case 1:
                return new TravelInfoFragment();



            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}

