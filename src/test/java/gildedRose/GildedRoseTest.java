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
    public void should_return_1_when_updateQuality_given_name_other_and_quality_0() {
        Item[] items = {new Item("other", 1, 0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
    }
}