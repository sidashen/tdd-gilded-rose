package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ProductTest {

  @Test
  void correct_price() {
    Product product = new Product(20, 0, "apple", 30);
    assumeTrue(product.getQuality() >= 0 && product.getQuality() <= 50);
  }

  @Test
  void when_expired_then_quality_double_reduction() {
    Product product = new Product(20, 0, "apple", 30);
    product.afterFewDays(5);
    assertEquals(10, product.getQuality());
  }

}
