package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sun.java2d.Surface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ProductTest {

  @Test
  @DisplayName("Check price of products")
  void correct_price() {
    NormalProduct normalProduct = new NormalProduct(20, 0, "apple", 30);
    assumeTrue(normalProduct.getQuality() >= 0 && normalProduct.getQuality() <= 50);
  }

  @Test
  @DisplayName("Check quality reduction with the increase of day")
  void when_expired_then_quality_double_reduction() {
    NormalProduct normalProduct = new NormalProduct(20, 5, "apple", 30);
    normalProduct.afterFewDays(5);
    assertEquals(10, normalProduct.getQuality());
  }

  @Test
  @DisplayName("Check quality increase with the increase of day")
  void when_day_add_then_quality_add() {
    AgedBrie agedBrie = new AgedBrie(20, 0, "wine");
    agedBrie.afterFewDays(5);
    assertEquals(25, agedBrie.getQuality());
  }

  @Test
  void when_day_add_quality_stay() {
    Sulfuras sulfuras = new Sulfuras(20, 0, "sul");
    sulfuras.afterFewDays(5);
    assertEquals(20, sulfuras.getQuality());
  }
}
