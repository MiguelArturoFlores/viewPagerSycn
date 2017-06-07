package com.example.miguelflores.viewpagertest;

import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class PagerManager {

    private List<ViewPager> pagerList;

    public PagerManager() {
        this.pagerList = new ArrayList<>();
    }

    public void addPager(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new MyPagerListener(viewPager));

        pagerList.add(viewPager);
    }

    public class MyPagerListener implements ViewPager.OnPageChangeListener {

        private ViewPager viewPager;
        private int mScrollState = ViewPager.SCROLL_STATE_IDLE;

        public MyPagerListener(ViewPager viewPager) {
            this.viewPager = viewPager;
        }

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            if (mScrollState == ViewPager.SCROLL_STATE_IDLE) {
                return;
            }
            updatePagersPositionExcluding(viewPager);
        }

        @Override
        public void onPageSelected(int position) {
        }

        @Override
        public void onPageScrollStateChanged(int state) {
            mScrollState = state;
            if (state == ViewPager.SCROLL_STATE_IDLE) {
                updatePagersPositionExcluding2(viewPager);
            }
        }

        private void updatePagersPositionExcluding(ViewPager currentPager) {
            for (ViewPager pager : pagerList) {
                if (pager != currentPager) {
                    pager.setScrollX(currentPager.getScrollX());
                }
            }
        }

        private void updatePagersPositionExcluding2(ViewPager currentPager) {
            for (ViewPager pager : pagerList) {
                if (pager != currentPager) {
                    pager.setCurrentItem(currentPager.getCurrentItem(), true);
                }
            }
        }

    }
}
