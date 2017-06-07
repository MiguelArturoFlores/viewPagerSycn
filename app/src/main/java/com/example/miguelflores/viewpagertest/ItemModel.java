package com.example.miguelflores.viewpagertest;

public class ItemModel {

    public static final int MODEL_1 = 1;
    public static final int MODEL_2 = 2;
    public static final int MODEL_3 = 3;

    private int type;
    private String name;
    private String description;

    public ItemModel(int type, String name, String description) {
        this.type = type;
        this.name = name;
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
