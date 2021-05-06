package com.saleh.fragmentex.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentC fragmentC;

    public FragmentAdapter(FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                if (fragmentA == null) {
                    fragmentA = FragmentA.newInstance();
                }
                return fragmentA;
            case 1:
                if (fragmentB == null) {
                    fragmentB = FragmentB.newInstance();
                }
                return fragmentB;
            case 2:
            default:
                if (fragmentC == null) {
                    fragmentC = FragmentC.newInstance();
                }
                return fragmentC;
        }
    }

    // must return the number of fragments we're using otherwise they won't appear
    @Override
    public int getCount() {
        return 3;
    }

    // having title is optional
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "A";
            case 1:
                return "B";
            case 2:
                return "C";
            default:
                return "";
        }
    }
}
