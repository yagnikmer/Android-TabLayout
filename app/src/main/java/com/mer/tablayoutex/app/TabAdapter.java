package com.mer.tablayoutex.app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    String[] mTabList = {"Tab 0", "Tab 1", "Tab 2"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return setIndexwithFragment(position);
    }

    @Override
    public int getCount() {
        return mTabList.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabList[position];
    }

    private Fragment setIndexwithFragment(int index) {
        TabFragment frag = new TabFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("index", index);
        frag.setArguments(bundle);
        return frag;
    }
}
