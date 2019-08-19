package gildedRose;

public class OtherItemStrategy implements ItemStrategy {
    @Override
    public void updateItemQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        updateSellIn(item);
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }

    public void updateSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }
}