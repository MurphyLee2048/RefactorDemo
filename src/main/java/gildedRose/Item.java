package gildedRose;

public class Item {

    public String name;  // TODO：private？

    public int sellIn;

    public int quality;

    private ItemStrategy itemStrategy;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void createItemStrategy() {
        switch (name) {
            case "Aged Brie":
                this.itemStrategy = new ABItemStrategy();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                this.itemStrategy = new BackstageItemStrategy();
                break;
            case "Sulfuras, Hand of Ragnaros":
                this.itemStrategy = new SulfurasItemStrategy();
                break;
            default:
                this.itemStrategy = new OtherItemStrategy();
        }
    }

    public void updateItemQuality(Item item) {
        createItemStrategy();
        itemStrategy.updateItemQuality(item);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
