package gildedRose;

public class SulfurasItemStrategy implements ItemStrategy {
    @Override
    public void updateItemQuality(Item item) {

    }

    public void updateSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }
}
