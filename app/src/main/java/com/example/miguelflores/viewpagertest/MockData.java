package com.example.miguelflores.viewpagertest;

import java.util.ArrayList;
import java.util.List;

public class MockData {

    public static List<ItemModel> mockItemViews() {
        List<ItemModel> itemModelList = new ArrayList<>();

        ItemModel item = new ItemModel(ItemModel.MODEL_1, "item1 1", "descrption 1");
        itemModelList.add(item);

        item = new ItemModel(ItemModel.MODEL_1, "item1 2", "descrption 2");
        itemModelList.add(item);

        item = new ItemModel(ItemModel.MODEL_1, "item1 3", "descrption 3");
        itemModelList.add(item);

        item = new ItemModel(ItemModel.MODEL_1, "item1 4", "descrption 4");
        itemModelList.add(item);

        item = new ItemModel(ItemModel.MODEL_1, "item1 5", "descrption 5");
        itemModelList.add(item);

        return itemModelList;
    }

    public static List<ItemModel> mockItemViews2() {
        List<ItemModel> itemModelList = new ArrayList<>();

        ItemModel item = new ItemModel(ItemModel.MODEL_2, "item1 1", "descrption 1");
        itemModelList.add(item);

        item = new ItemModel(ItemModel.MODEL_2, "item1 2", "descrption 2");
        itemModelList.add(item);

        item = new ItemModel(ItemModel.MODEL_2, "item1 3", "descrption 3");
        itemModelList.add(item);

        item = new ItemModel(ItemModel.MODEL_2, "item1 4", "descrption 4");
        itemModelList.add(item);

        item = new ItemModel(ItemModel.MODEL_2, "item1 5", "descrption 5");
        itemModelList.add(item);

        return itemModelList;
    }

}
