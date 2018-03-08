package com.example.android.truckeetourguide;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by genetrinks on 2/27/18.
 */

public class ActivityFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ActivityFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RestaurantFragment();
            case 1:
                return new LodgingFragment();
           case 2:
               return new OutdoorsFragment();
            default:
                return new HistoricalFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.restaurant_page_title);
            case 1:
                return mContext.getString(R.string.lodging_page_title);
            case 2:
                return mContext.getString(R.string.outdoors_page_title);
            default:
                return mContext.getString(R.string.historical_page_title);
        }
    }
}

