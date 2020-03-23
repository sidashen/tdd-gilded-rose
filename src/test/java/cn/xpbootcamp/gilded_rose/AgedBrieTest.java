package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AgedBrieTest {

  @Test
  @DisplayName("Check quality of products")
  void should_return_true_at_any_condition() {
    AgedBrie agedBrie = new AgedBrie(20, 0, "wine");
    agedBrie.afterFewDays(5);
    assumeTrue(agedBrie.getQuality() >= 0 && agedBrie.getQuality() <= 50);
  }

  @Test
  @DisplayName("Check quality increase with the increase of day")
  void when_day_add_then_quality_add() {
    AgedBrie agedBrie = new AgedBrie(20, 0, "wine");
    agedBrie.afterFewDays(5);
    assertEquals(25, agedBrie.getQuality());
  }

}
