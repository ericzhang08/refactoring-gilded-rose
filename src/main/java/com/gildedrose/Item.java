package com.gildedrose;

public class Item {

    public String name;

    public int expirationDate;

    public int price;
    private ItemType itemType;

    public Item(String name, int expirationDate, int price) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.price = price;
        this.itemType = ItemTypeFactory.create(name);

    }

    @Override
    public String toString() {
        return this.name + ", " + this.expirationDate + ", " + this.price;
    }

    boolean isBackstagePasses() {
        return itemType.isBackstagePasses();
    }

    boolean isSulfuras() {
        return itemType.isSulfuras();
    }

    boolean isAgedBrie() {
        return itemType.isAgedBrie();
    }
}
