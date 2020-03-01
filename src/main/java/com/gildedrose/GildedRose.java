package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].price > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].price = items[i].price - 1;
                    }
                }
            } else {
                if (items[i].price < 50) {
                    items[i].price = items[i].price + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].expirationDate < 11) {
                            if (items[i].price < 50) {
                                items[i].price = items[i].price + 1;
                            }
                        }

                        if (items[i].expirationDate < 6) {
                            if (items[i].price < 50) {
                                items[i].price = items[i].price + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].expirationDate = items[i].expirationDate - 1;
            }

            if (items[i].expirationDate < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].price > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].price = items[i].price - 1;
                            }
                        }
                    } else {
                        items[i].price = items[i].price - items[i].price;
                    }
                } else {
                    if (items[i].price < 50) {
                        items[i].price = items[i].price + 1;
                    }
                }
            }
        }
    }
}
