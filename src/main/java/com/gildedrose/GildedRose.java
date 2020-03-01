package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (Item item : items) {
            if (!item.isAged_brie() && !item.isBackstagePasses()) {
                if (item.price > 0) {
                    if (!item.isSulfuras()) {
                        item.price = item.price - 1;
                    }
                }
            } else {
                if (item.price < 50) {
                    item.price = item.price + 1;

                    if (item.isBackstagePasses()) {
                        if (item.expirationDate < 11) {
                            if (item.price < 50) {
                                item.price = item.price + 1;
                            }
                        }

                        if (item.expirationDate < 6) {
                            if (item.price < 50) {
                                item.price = item.price + 1;
                            }
                        }
                    }
                }
            }

            if (!item.isSulfuras()) {
                item.expirationDate = item.expirationDate - 1;
            }

            if (item.expirationDate < 0) {
                if (!item.isAged_brie()) {
                    if (!item.isBackstagePasses()) {
                        if (item.price > 0) {
                            if (!item.isSulfuras()) {
                                item.price = item.price - 1;
                            }
                        }
                    } else {
                        item.price = item.price - item.price;
                    }
                } else {
                    if (item.price < 50) {
                        item.price = item.price + 1;
                    }
                }
            }
        }
    }

}
