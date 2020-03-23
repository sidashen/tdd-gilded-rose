package cn.xpbootcamp.gilded_rose;

public class BackstagePass extends Product {
  private int ExpireDate;

  public BackstagePass(int quality, int sellIn, String name, int expireDate) {
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
    this.setSellIn(this.getSellIn() + day);
    for (int i = 1; i <= day; i++) {
      if ((this.getExpireDate() - i) >= 10 && this.getQuality() <= 50) {
        this.setQuality(this.getQuality() + 1);
      } else if ((this.getExpireDate() - i) < 10 && (this.getExpireDate() - i) >= 5 && this.getQuality() <= 50) {
        this.setQuality(this.getQuality() + 2);
      } else if ((this.getExpireDate() - i) < 5 && (this.getExpireDate() - i) > 0 && this.getQuality() <= 50) {
        this.setQuality(this.getQuality() + 3);
      } else {
        this.setQuality(0);
        System.out.println("It is out of date");
      }
    }
  }
}
