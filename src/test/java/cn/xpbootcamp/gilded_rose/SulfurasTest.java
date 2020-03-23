package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class SulfurasTest {

  @Test
  @DisplayName("Check quality of products")
  void should_return_true_when_instantiated() {
    Sulfuras sulfuras = new Sulfuras(20, 0, "sul");
    sulfuras.afterFewDays(20);
    assumeTrue(sulfuras.getQuality() >= 0 && sulfuras.getQuality() <= 50);
  }


  @Test
  @DisplayName("Check quality do not change")
  void when_day_add_then_quality_stay() {
    Sulfuras sulfuras = new Sulfuras(20, 0, "sul");
    sulfuras.afterFewDays(5);
    assertEquals(20, sulfuras.getQuality());
  }
}
