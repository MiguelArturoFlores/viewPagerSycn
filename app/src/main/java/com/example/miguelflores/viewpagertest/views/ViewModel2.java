package com.example.miguelflores.viewpagertest.views;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.miguelflores.viewpagertest.ItemModel;
import com.example.miguelflores.viewpagertest.R;

public class ViewModel2 extends FrameLayout {

    private TextView textView1;
    private TextView textView2;

    public ViewModel2(@NonNull Context context) {
        this(context, null);
    }

    public ViewModel2(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, null, 0);
    }

    public ViewModel2(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.item_2, this, true);
        textView1 = (TextView) findViewById(R.id.text1);
        textView2 = (TextView) findViewById(R.id.text2);

    }

    public void update(ItemModel itemModel) {
        textView2.setText(itemModel.getName());
        textView1.setText(itemModel.getDescription());
    }
}
