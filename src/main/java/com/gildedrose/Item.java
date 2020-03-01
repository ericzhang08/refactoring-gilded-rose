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

    void updatePrice() {
        if (isAgedBrie() || isBackstagePasses()) {
            if (price < 50) {
                price = price + 1;

                if (isBackstagePasses()) {
                    if (expirationDate < 11) {
                        if (price < 50) {
                            price = price + 1;
                        }
                    }

                    if (expirationDate < 6) {
                        if (price < 50) {
                            price = price + 1;
                        }
                    }
                }
            }
        } else {
            if (!isSulfuras()) {
                if (price > 0) {
                    price = price - 1;
                }
            }
        }

        if (!isSulfuras()) {
            expirationDate = expirationDate - 1;
        }

        if (expirationDate < 0) {
            if (!isAgedBrie()) {
                if (!isBackstagePasses()) {
                    if (price > 0) {
                        if (!isSulfuras()) {
                            price = price - 1;
                        }
                    }
                } else {
                    price = price - price;
                }
            } else {
                if (price < 50) {
                    price = price + 1;
                }
            }
        }
    }
}
