package com.example.miguelflores.viewpagertest.activities;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.miguelflores.viewpagertest.MockData;
import com.example.miguelflores.viewpagertest.PagerManager;
import com.example.miguelflores.viewpagertest.R;
import com.example.miguelflores.viewpagertest.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager pager1;
    private ViewPager pager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        pager1 = (ViewPager) findViewById(R.id.viewpager1);
        pager2 = (ViewPager) findViewById(R.id.viewpager2);
        findViewById(R.id.button).setOnClickListener(this);

        pager1.setAdapter(new ViewPagerAdapter(MockData.mockItemViews()));
        pager2.setAdapter(new ViewPagerAdapter(MockData.mockItemViews2()));

        PagerManager manager = new PagerManager();
        manager.addPager(pager1);
        manager.addPager(pager2);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
