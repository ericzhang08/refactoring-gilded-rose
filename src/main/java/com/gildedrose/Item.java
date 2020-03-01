package com.gildedrose;

public class Item {

    public String name;

    public int expirationDate;

    public int price;

    public Item(String name, int expirationDate, int price) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.expirationDate + ", " + this.price;
    }

    boolean isTargetName(String targetName) {
        return name.equals(targetName);
    }

    boolean isBackstagePasses() {
        return isTargetName("Backstage passes to a TAFKAL80ETC concert");
    }

    boolean isSulfuras() {
        return isTargetName("Sulfuras, Hand of Ragnaros");
    }

    boolean isAged_brie() {
        return isTargetName("Aged Brie");
    }
}
