package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(String name, int expirationDate, int price) {
        super(name, expirationDate, price);
    }

    @Override
    public boolean isAgedBrie() {
        return true;
    }

    @Override
    public void updateFirstStep() {
        if (price < 50) {
            price = price + 1;
        }
    }
}
