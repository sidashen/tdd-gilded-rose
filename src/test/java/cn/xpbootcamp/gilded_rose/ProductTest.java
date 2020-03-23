package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

  Product product = new Product();

  @Test
  void price() {
    assertEquals(true, isCorrectPrice());
  }



  public Boolean isCorrectPrice() {
    if (product.getQuality() >= 0 && product.getQuality() <= 50) {
      System.out.println(product.getQuality());
      return true;
    } else {
      return false;
    }
  }
}
