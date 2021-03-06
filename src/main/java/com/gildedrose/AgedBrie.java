package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(String name, int expirationDate, int price) {
        super(name, expirationDate, price);
    }

    @Override
    public void firstUpdateRule() {
        if (price < 50) {
            price = price + 1;
        }
    }

    @Override
    public void ThirdUpdateRule() {
        if (expirationDate >= 0 || price >= 50) return;
        price = price + 1;
    }
}
