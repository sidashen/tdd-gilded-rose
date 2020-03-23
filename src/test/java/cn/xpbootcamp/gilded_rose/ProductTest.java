package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ProductTest {

  @Test
  void correct_price() {
    NormalProduct normalProduct = new NormalProduct(20, 0, "apple", 30);
    assumeTrue(normalProduct.getQuality() >= 0 && normalProduct.getQuality() <= 50);
  }

  @Test
  void when_expired_then_quality_double_reduction() {
    NormalProduct normalProduct = new NormalProduct(20, 0, "apple", 30);
    normalProduct.afterFewDays(10);
    assertEquals(0, normalProduct.getQuality());
  }

}
