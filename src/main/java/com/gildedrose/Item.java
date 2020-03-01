package com.gildedrose;

public class Item {

    public String name;

    public int expirationDate;

    public int price;

    Item(String name, int expirationDate, int price) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.expirationDate + ", " + this.price;
    }

    boolean isBackstagePasses() {
        return false;
    }

    boolean isSulfuras() {
        return false;
    }

    boolean isAgedBrie() {
        return false;
    }

    void updatePrice() {
        updateFirstStep();

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

    public void updateFirstStep() {
        if (price > 0) {
            price = price - 1;
        }
    }

}
