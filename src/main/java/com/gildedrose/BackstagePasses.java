package com.gildedrose;

public class BackstagePasses extends Item {
    public BackstagePasses(String name, int expirationDate, int price) {
        super(name, expirationDate, price);
    }

    @Override
    public void firstUpdateRule() {
        if (price >= 50) return;
        price = price + 1;

        if (expirationDate < 11 && price < 50) {
            price = price + 1;
        }

        if (expirationDate < 6 && price < 50) {
            price = price + 1;

        }
    }

    @Override
    public void ThirdUpdateRule() {
        price = price - price;

    }
}
