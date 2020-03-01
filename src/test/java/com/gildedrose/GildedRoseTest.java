package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("foo", app.items[0].name);
        assertThat(app.items[0].price, is(4));
        assertThat(app.items[0].expirationDate, is(0));
    }

    @Test
    public void testOutput() {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 3;

        String[] expects = new String[3];
        expects[0] = "-------- day 0 --------\n" +
                "name, sellIn, quality\n" +
                "+5 Dexterity Vest, 10, 20\n" +
                "Aged Brie, 2, 0\n" +
                "Elixir of the Mongoose, 5, 7\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 15, 20\n" +
                "Backstage passes to a TAFKAL80ETC concert, 10, 49\n" +
                "Backstage passes to a TAFKAL80ETC concert, 5, 49\n" +
                "Backstage passes to a TAFKAL80ETC concert, 1, 20\n" +
                "Conjured Mana Cake, 3, 6\n";
        expects[1] = "-------- day 1 --------\n" +
                "name, sellIn, quality\n" +
                "+5 Dexterity Vest, 9, 19\n" +
                "Aged Brie, 1, 1\n" +
                "Elixir of the Mongoose, 4, 6\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 14, 21\n" +
                "Backstage passes to a TAFKAL80ETC concert, 9, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, 4, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, 0, 23\n" +
                "Conjured Mana Cake, 2, 5\n";
        expects[2] = "-------- day 2 --------\n" +
                "name, sellIn, quality\n" +
                "+5 Dexterity Vest, 8, 18\n" +
                "Aged Brie, 0, 2\n" +
                "Elixir of the Mongoose, 3, 5\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 13, 22\n" +
                "Backstage passes to a TAFKAL80ETC concert, 8, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, 3, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, -1, 0\n" +
                "Conjured Mana Cake, 1, 4\n";

        for (int i = 0; i < days; i++) {
            StringBuilder sb = new StringBuilder();
            System.out.println("-------- day " + i + " --------");
            sb.append("-------- day " + i + " --------\n");
            System.out.println("name, sellIn, quality");
            sb.append("name, sellIn, quality\n");
            for (Item item : items) {
                System.out.println(item);
                sb.append(item + "\n");
            }
            System.out.println();
            assertEquals(expects[i], sb.toString());
            app.update_quality();
        }

    }

}
