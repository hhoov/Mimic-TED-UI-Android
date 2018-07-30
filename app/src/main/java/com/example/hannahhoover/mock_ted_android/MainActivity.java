package com.example.hannahhoover.mock_ted_android;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create an instance of the tab layout from the view
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        // Set the text for each tab
        tabLayout.addTab(tabLayout.newTab()
                .setIcon(R.drawable.ic_tab_talks)
                .setContentDescription(R.string.talks));
        tabLayout.addTab(tabLayout.newTab()
                .setIcon(R.drawable.ic_tab_playlists)
                .setContentDescription(R.string.playlists));
        tabLayout.addTab(tabLayout.newTab()
                .setIcon(R.drawable.ic_tab_podcasts)
                .setContentDescription(R.string.podcasts));
        tabLayout.addTab(tabLayout.newTab()
                .setIcon(R.drawable.ic_tab_surpriseme_temp)
                .setContentDescription(R.string.surprise_me));
        tabLayout.addTab(tabLayout.newTab()
                .setIcon(R.drawable.ic_tab_mytalks)
                .setContentDescription(R.string.my_talks));
        // Set the tabs to fill the entire layout
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Use PagerAdapter to manage page views in each activity ?
        // Each page is represented by its own activity
        // This is another example of the adapter pattern
        final ViewPager viewPager = findViewById(R.id.pager);
        final PagerAdapter adapter = new CustomPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        // Setting a listener for clicks
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onPrepareOptionsMenu(menu);
    }
}
