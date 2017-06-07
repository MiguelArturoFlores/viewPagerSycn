package com.example.miguelflores.viewpagertest.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.miguelflores.viewpagertest.MockData;
import com.example.miguelflores.viewpagertest.PagerManager;
import com.example.miguelflores.viewpagertest.R;
import com.example.miguelflores.viewpagertest.ViewPagerAdapter;

/**
 * Created by miguel.flores on 7/06/2017.
 */
public class SecondActivity extends AppCompatActivity {

    private PagerManager pagerManager;
    private LinearLayout layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
    }

    private void init() {
        pagerManager = new PagerManager();
        layoutManager = (LinearLayout) findViewById(R.id.containerLayout);
        addPager1();
        addPager2();
        addPager1();
        addPager2();
    }

    private void addPager1() {
        ViewPager viewPager1 = new ViewPager(this);
        viewPager1.setAdapter(new ViewPagerAdapter(MockData.mockItemViews()));
        layoutManager.addView(viewPager1, new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getResources()
                .getDimensionPixelOffset(R
                        .dimen.view_pager_height)));
        TextView textView = new TextView(this);
        textView.setText("Separator 1");
        layoutManager.addView(textView);
        pagerManager.addPager(viewPager1);
    }

    private void addPager2() {
        ViewPager viewPager1 = new ViewPager(this);
        viewPager1.setAdapter(new ViewPagerAdapter(MockData.mockItemViews2()));
        layoutManager.addView(viewPager1, new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getResources()
                .getDimensionPixelOffset(R
                        .dimen.view_pager_height)));
        TextView textView = new TextView(this);
        textView.setText("Separator 2");
        layoutManager.addView(textView);
        pagerManager.addPager(viewPager1);
    }
}
