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

    boolean isBackstagePasses() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    boolean isSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    boolean isAged_brie() {
        return name.equals("Aged Brie");
    }
}
