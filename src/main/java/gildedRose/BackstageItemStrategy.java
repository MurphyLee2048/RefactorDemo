package gildedRose;

public class BackstageItemStrategy implements ItemStrategy {
    @Override
    public void updateItemQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
            updateSellIn(item);
            if (item.sellIn < 0) {
                item.quality = item.quality - item.quality;
            }
        }
    }

    public void updateSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }
}
