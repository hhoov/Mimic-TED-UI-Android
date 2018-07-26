package com.example.hannahhoover.mock_ted_android;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CustomPagerAdapter extends FragmentStatePagerAdapter {

    private int numOfTabs;

    public CustomPagerAdapter(FragmentManager fragmentManager, int numOfTabs) {
        super(fragmentManager);
        this.numOfTabs = numOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TalksTabFragment();
            case 1:
                return new PlaylistsTabFragment();
            case 2:
                return new PodcastsTabFragment();
            case 3:
                return new SurpriseMeTabFragment();
            case 4:
                return new MyTalksTabFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
