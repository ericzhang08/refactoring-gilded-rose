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
    //todo 这里有疑问，这几个函数应该如何命名
    void updatePrice() {
        firstUpdateRule();
        secondUpdateRule();
        ThirdUpdateRule();
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
        if (expirationDate >= 0 || price <= 0) return;

        price = price - 1;

    }


}
