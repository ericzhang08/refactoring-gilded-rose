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

    void updatePrice() {
        firstUpdateRule();
        secondUpdateRule();
        if (expirationDate < 0) {
            ThirdUpdateRule();
        }
    }

    public void firstUpdateRule() {
        if (price > 0) {
            price = price - 1;
        }
    }

    public void secondUpdateRule() {
        expirationDate = expirationDate - 1;
    }


    public void ThirdUpdateRule() {
        if (price > 0) {
            price = price - 1;

        }

    }


}
