package com.gildedrose;

public class Sulfuras extends Item {
    @Override
    public void updateFirstStep() {
    }

    public Sulfuras(String name, int expirationDate, int price) {
        super(name, expirationDate, price);
    }

    @Override
    public boolean isSulfuras() {
        return true;
    }
}
