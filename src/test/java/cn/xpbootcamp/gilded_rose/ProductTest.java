package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ProductTest {

  @Test
  void price() {
    Product product = new Product();
    assumeTrue(product.getQuality() >= 0 && product.getQuality() <= 50);
//    assertEquals(true, isCorrectPrice());
  }

}
