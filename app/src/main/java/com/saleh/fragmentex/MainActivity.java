package com.saleh.fragmentex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;
import com.saleh.fragmentex.fragments.FragmentAdapter;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Hiding ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.pager);
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        TabLayout.Tab t1 = tabLayout.getTabAt(0);
        if (t1 != null) {
            t1.setIcon(R.drawable.icon_search);
        }
        TabLayout.Tab t2 = tabLayout.getTabAt(1);
        if (t2 != null) {
            t2.setIcon(R.drawable.icon_statement);
        }
        TabLayout.Tab t3 = tabLayout.getTabAt(2);
        if (t3 != null) {
            t3.setIcon(R.drawable.icon_star);
        }

        // may used in the future.
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d(TAG, "onTabSelected: " + tab.getContentDescription());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Log.d(TAG, "onTabUnselected: " + tab.getContentDescription());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Log.d(TAG, "onTabReselected: " + tab.getContentDescription());
            }
        });
    }
}