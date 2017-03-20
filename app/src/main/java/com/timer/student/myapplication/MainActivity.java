package com.timer.student.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.timer.student.myapplication.fragments.PlayerFragment;
import com.timer.student.myapplication.fragments.SingerListFrag;
import com.timer.student.myapplication.fragments.SongFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tableLayout = (TabLayout) findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);


        MusicPlayerAdapter adapter = new MusicPlayerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tableLayout.setupWithViewPager(viewPager);

    }

    public class MusicPlayerAdapter extends FragmentPagerAdapter {

        public MusicPlayerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new PlayerFragment();
                case 1:
                    return new SingerListFrag();
                case 2:
                    return new SongFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "플레이어";
                case 1:
                    return "아티스트";
                case 2:
                    return "노래";

            }
            return null;
        }
    }
}
