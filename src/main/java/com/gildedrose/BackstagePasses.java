package com.gildedrose;

public class BackstagePasses extends Item {
    public BackstagePasses(String name, int expirationDate, int price) {
        super(name, expirationDate, price);
    }

    @Override
    public boolean isBackstagePasses() {
        return true;
    }
}
