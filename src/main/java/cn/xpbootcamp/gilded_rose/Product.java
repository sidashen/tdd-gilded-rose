package cn.xpbootcamp.gilded_rose;

public abstract class Product {
  private int Quality;
  private int SellIn;
  private String name;

  public Product(int quality, int sellIn, String name) {
    Quality = quality;
    SellIn = sellIn;
    this.name = name;
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

  public abstract void afterFewDays(int day);

}
