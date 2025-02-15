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
    public void should_return_50_when_updateQuality_given_name_aged_brie_and_quality_50() {
        Item[] items = {new Item("Aged Brie", 1, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }

    @Test
    public void should_return_2_when_updateQuality_given_name_aged_brie_and_quality_1() {
        Item[] items = {new Item("Aged Brie", 1, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(2, items[0].quality);
    }

    @Test
    public void should_return_2_when_updateQuality_given_name_backstage_sellIn_11_quality_1() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 11, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(2, items[0].quality);
    }

    @Test
    public void should_return_50_when_updateQuality_given_name_backstage_sellIn_10_quality_50() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }

    @Test
    public void should_return_50_when_updateQuality_given_name_backstage_sellIn_10_quality_49() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }

    @Test
    public void should_return_50_when_updateQuality_given_name_backstage_sellIn_10_quality_48() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }

    @Test
    public void should_return_50_when_updateQuality_given_name_backstage_sellIn_5_quality_49() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }

    @Test
    public void should_return_50_when_updateQuality_given_name_backstage_sellIn_5_quality_48() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }

    @Test
    public void should_return_50_when_updateQuality_given_name_backstage_sellIn_5_quality_47() {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 47)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }


    @Test
    public void should_return_sellIn_9_when_updateQuality_given_name_other_and_sellIn_10() {
        Item[] items = {new Item("other", 10, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(9, items[0].sellIn);
    }

    @Test
    public void should_return_sellIn_10_when_updateQuality_given_name_sulfuras_and_sellIn_10() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", 10, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(10, items[0].sellIn);
    }


    @Test
    public void should_return_quality_0_when_updateQuality_given_name_other_quality_1_and_sellIn_negative_1() {
        Item[] items = {new Item("other", -1, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
    }

    @Test
    public void should_return_quality_1_when_updateQuality_given_name_sulfuras_quality_1_and_sellIn_negative_1() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", -1, 1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(1, items[0].quality);
    }

    @Test
    public void should_return_quality_0_when_updateQuality_given_name_sulfuras_quality_0_and_sellIn_negative_1() {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", -1, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
    }

    @Test
    public void should_return_quality_50_when_updateQuality_given_name_aged_brie_quality_49_and_sellIn_negative_1() {
        Item[] items = {new Item("Aged Brie", -1, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }

    @Test
    public void should_return_quality_50_when_updateQuality_given_name_aged_brie_quality_50_and_sellIn_negative_1() {
        Item[] items = {new Item("Aged Brie", -1, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }

    @Test
    public void should_return_quality_49_when_updateQuality_given_name_other_quality_50_and_sellIn_0() {
        Item[] items = {new Item("other", 0, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(48, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }
}