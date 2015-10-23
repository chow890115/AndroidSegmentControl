package com.huibin.androidsegmentcontrol;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private SegmentControl mSegmentControl ;
    private SegmentControl mSegmentControl2;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init() ;
    }

    private void init() {

        mSegmentControl = (SegmentControl) findViewById(R.id.segment_control);
        mSegmentControl.setOnSegmentControlClickListener(new SegmentControl.OnSegmentControlClickListener() {
            @Override
            public void onSegmentControlClick(int index) {
                Toast.makeText(getApplicationContext(), "index " + index + " is clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        mSegmentControl2 = (SegmentControl) findViewById(R.id.segment_control2);
        mPager = (ViewPager) findViewById(R.id.pager);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(TestFragment.newInstance("label1"));
        fragments.add(TestFragment.newInstance("label2"));
        fragments.add(TestFragment.newInstance("label3"));
        fragments.add(TestFragment.newInstance("label4"));
        mPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), fragments));
        mSegmentControl2.setSelectedTextColor(getResources().getColor(android.R.color.black));
        mSegmentControl2.setOnSegmentControlClickListener(new SegmentControl.OnSegmentControlClickListener() {
            @Override
            public void onSegmentControlClick(int index) {
                mPager.setCurrentItem(index);
            }
        });
        mPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mSegmentControl2.setCurrentIndex(position);
                if(position %2 != 0) {
                    mSegmentControl2.setSelectedBackgroundColors(getResources().getColor(android.R.color.darker_gray));
                }else {
                    mSegmentControl2.setSelectedBackgroundColors(0xff009688);
                }
            }
        });
    }


    private static class PagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments;

        public PagerAdapter(FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }
}
