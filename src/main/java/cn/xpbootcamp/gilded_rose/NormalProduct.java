package cn.xpbootcamp.gilded_rose;

public class NormalProduct extends Product {

  public NormalProduct(int quality, int sellIn, String name, int expireDate) {
    super(quality, sellIn, name, expireDate);
  }

  @Override
  public void afterFewDays(int day) {
    for (int i = 0; i < day; i++) {
      if (this.getSellIn() <= this.getExpireDate() && this.getQuality() - 2 >= 0) {
        this.setSellIn(this.getSellIn() + 1);
        this.setQuality(this.getQuality() - 2);
      } else {
        System.out.println("it is out of date");
        break;
      }
    }
  }
}
