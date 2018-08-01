package com.example.hannahhoover.mock_ted_android;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private int[] tabIcons = {R.drawable.ic_tab_talks,
                            R.drawable.ic_tab_playlists,
                            R.drawable.ic_tab_podcasts,
                            R.drawable.ic_tab_surpriseme_temp,
                            R.drawable.ic_tab_mytalks};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ViewPager viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        // Create an instance of the tab layout from the view
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

    }

    // Todo -- NullPointer warnings here - find if there's a safer way to set the icons than this
    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
    }

    private void setupViewPager(ViewPager viewPager) {
        CustomPagerAdapter adapter = new CustomPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TalksTabFragment());
        adapter.addFragment(new PlaylistsTabFragment());
        adapter.addFragment(new PodcastsTabFragment());
        adapter.addFragment(new SurpriseMeTabFragment());
        adapter.addFragment(new MyTalksTabFragment());
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onPrepareOptionsMenu(menu);
    }
}
