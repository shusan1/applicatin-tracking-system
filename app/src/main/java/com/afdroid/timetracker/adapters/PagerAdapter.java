package com.afdroid.timetracker.adapters;

/**
 * Created by afrin on 12/7/17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.afdroid.timetracker.fragments.StatsFragment;

import java.util.List;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    List<String> appList;

    public PagerAdapter(FragmentManager fm, int NumOfTabs, List<String> applist) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.appList = applist;
    }

    @Override
    public Fragment getItem(int position) {

        StatsFragment statsFragment = new StatsFragment();
        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("period", position);
//        args.putStringArrayList("applist", (ArrayList<String>)appList);
        statsFragment.setArguments(args);

        return statsFragment;

        /*switch (position) {
            case 0:
                DailyStats tab1 = new DailyStats();
                return tab1;
            case 1:
                WeeklyStats tab2 = new WeeklyStats();
                return tab2;
            case 2:
                MonthlyStats tab3 = new MonthlyStats();
                return tab3;
            default:
                return null;
        }*/
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}

