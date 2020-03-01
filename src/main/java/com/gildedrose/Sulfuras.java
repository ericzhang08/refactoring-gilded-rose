package com.gildedrose;

public class Sulfuras extends Item {

    public Sulfuras(String name, int expirationDate, int price) {
        super(name, expirationDate, price);
    }

    @Override
    public boolean isSulfuras() {
        return true;
    }

    @Override
    public void updateFirstStep() {
    }

    @Override
    public void updateSecondStep() {

    }
}
