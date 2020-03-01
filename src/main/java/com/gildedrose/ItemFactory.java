package com.gildedrose;

public class ItemFactory {
    static Item create(String name, int expirationDate , int price ) {
        switch (name){
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePasses(name, expirationDate, price);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(name, expirationDate, price);
            case "Aged Brie":
                return new AgedBrie(name, expirationDate, price);
        }
        return new Item(name, expirationDate, price);
    }
}
