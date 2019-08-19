package gildedRose;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_1_when_updateQuality_given_name_other_and_quality_2() {
        Item[] items = {new Item("other", 1, 2)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(1, items[0].quality);
    }

    @Test
    public void should_return_2_when_updateQuality_given_name_sulfuras_and_quality_2() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", 1, 2)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(2, items[0].quality);
    }

    @Test
    public void should_return_0_when_updateQuality_given_name_other_and_quality_0() {
        Item[] items = {new Item("other", 1, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
    }

    @Test
    public void should_return_1_when_updateQuality_given_name_aged_brie_and_quality_51() {
        Item[] items = {new Item("Aged Brie", 1, 51)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(51, items[0].quality);
    }

    @Test
    public void should_return_2_when_updateQuality_given_name_aged_brie_and_quality_1() {
        Item[] items = {new Item("Aged Brie", 1, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(2, items[0].quality);
    }

    @Test
    public void should_return_2_when_updateQuality_given_name_backstage_sellIn_12_quality_1() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 12, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(2, items[0].quality);
    }
}