package com.example.miguelflores.viewpagertest;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.example.miguelflores.viewpagertest.views.ViewModel1;
import com.example.miguelflores.viewpagertest.views.ViewModel2;

import java.util.ArrayDeque;
import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    public static final float VIEW_PAGER_WIDTH = 0.44f;
    private List<ItemModel> itemModelList;

    //TODO add recycler functionality
    private final ArrayDeque<View> recycledViewStack;

    public ViewPagerAdapter(List<ItemModel> itemModelList) {
        this.itemModelList = itemModelList;
        recycledViewStack = new ArrayDeque<>();
    }

    @Override
    public View instantiateItem(ViewGroup container, int position) {
        ItemModel model = itemModelList.get(position);
        View view = null;
        switch (model.getType()) {
            case ItemModel.MODEL_1:
                //TODO add recycler functionality using the view tag or viewholde pattern etc.
                ViewModel1 viewModel1 = new ViewModel1(container.getContext());
                viewModel1.update(model);
                view = viewModel1;
                break;
            case ItemModel.MODEL_2:
                ViewModel2 viewModel2 = new ViewModel2(container.getContext());
                viewModel2.update(model);
                view = viewModel2;
                break;
            case ItemModel.MODEL_3:
                view = new ViewModel1(container.getContext());
                break;

        }
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return itemModelList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (View) object;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    private View getRecycledView() {
        return recycledViewStack.isEmpty() ? null : recycledViewStack.pop();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        recycledViewStack.push((View) object);
    }

    @Override
    public float getPageWidth(int page) {
        return VIEW_PAGER_WIDTH;
    }
}
