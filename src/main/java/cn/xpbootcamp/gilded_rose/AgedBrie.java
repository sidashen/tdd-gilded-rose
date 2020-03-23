package cn.xpbootcamp.gilded_rose;

public class AgedBrie extends Product {

  public AgedBrie(int quality, int sellIn, String name) {
    super(quality, sellIn, name);
  }

  @Override
  public void afterFewDays(int day) {
    this.setQuality(this.getQuality() + day);
    this.setSellIn(this.getSellIn() + day);
  }

}
