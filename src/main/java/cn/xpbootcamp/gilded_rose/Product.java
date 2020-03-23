package cn.xpbootcamp.gilded_rose;

public class Product {
  private int Quality;
  private int SellIn;
  private String name;
  private int ExpireDate;

  public Product(int quality, int sellIn, String name, int expireDate) {
    Quality = quality;
    SellIn = sellIn;
    this.name = name;
    ExpireDate = expireDate;
  }

  public int getQuality() {
    return Quality;
  }

  public void setQuality(int quality) {
    Quality = quality;
  }

  public int getSellIn() {
    return SellIn;
  }

  public void setSellIn(int sellIn) {
    SellIn = sellIn;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getExpireDate() {
    return ExpireDate;
  }

  public void setExpireDate(int expireDate) {
    ExpireDate = expireDate;
  }

  public void afterFewDays(int day) {
    if (SellIn <= ExpireDate) {
      SellIn += day;
      Quality -= day * 2;
    } else {
      System.out.println("it is out of date");
    }
  }

}
