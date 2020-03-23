package cn.xpbootcamp.gilded_rose;

public class AgedBrie extends Product {

  public AgedBrie(int quality, int sellIn, String name) {
    super(quality, sellIn, name);
  }

  @Override
  public void afterFewDays(int day) {
    this.setSellIn(this.getSellIn() + day);
    for (int i = 1; i <= day; i++) {
      if (this.getQuality() <= 50) {
        this.setQuality(this.getQuality() + 1);
      }
    }
  }

}
