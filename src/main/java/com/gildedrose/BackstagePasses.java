package com.gildedrose;

public class BackstagePasses extends Item {
    public BackstagePasses(String name, int expirationDate, int price) {
        super(name, expirationDate, price);
    }

    @Override
    public void updateFirstStep() {
        if (price < 50) {
            price = price + 1;
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

    @Override
    public boolean isBackstagePasses() {
        return true;
    }
}
