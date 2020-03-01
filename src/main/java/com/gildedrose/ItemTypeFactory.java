package com.gildedrose;

public class ItemTypeFactory {
    public static ItemType create(String name) {
        switch (name){
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePasses();
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras();
            case "Aged Brie":
                return new AgedBrie();
        }
        return new ItemType();
    }

}
