package cn.xpbootcamp.gilded_rose;

public class NormalProduct extends Product {
  private int ExpireDate;

  public NormalProduct(int quality, int sellIn, String name, int expireDate) {
    super(quality, sellIn, name);
    this.ExpireDate = expireDate;
  }

  public int getExpireDate() {
    return ExpireDate;
  }

  public void setExpireDate(int expireDate) {
    ExpireDate = expireDate;
  }

  @Override
  public void afterFewDays(int day) {
    for (int i = 0; i < day; i++) {
      if (this.getSellIn() <= this.getExpireDate() && this.getQuality() - 2 >= 0) {
        this.setSellIn(this.getSellIn() + 1);
        this.setQuality(this.getQuality() - 2);
      } else {
        System.out.println("It is out of date");
        break;
      }
    }
  }
}
