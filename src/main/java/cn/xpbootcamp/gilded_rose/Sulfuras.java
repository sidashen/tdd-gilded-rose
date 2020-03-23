package cn.xpbootcamp.gilded_rose;

public class Sulfuras extends Product {

  public Sulfuras(int quality, int sellIn, String name) {
    super(quality, sellIn, name);
  }

  @Override
  public void afterFewDays(int day) {
    return;
  }
}
