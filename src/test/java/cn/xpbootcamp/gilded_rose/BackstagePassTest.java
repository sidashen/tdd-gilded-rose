package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class BackstagePassTest {

  @Test
  @DisplayName("Check quality of products")
  void should_return_true_at_any_condition() {
    BackstagePass backstagePass = new BackstagePass(20, 0, "ticket", 20);
    backstagePass.afterFewDays(10);
    assumeTrue(backstagePass.getQuality() >= 0 && backstagePass.getQuality() <= 50);
  }


  @Test
  @DisplayName("Check quality when more than 10 days left")
  void when_day_add_then_quality_add() {
    BackstagePass backstagePass = new BackstagePass(20, 0, "ticket", 20);
    backstagePass.afterFewDays(10);
    assertEquals(30, backstagePass.getQuality());
  }

  @Test
  @DisplayName("Check quality when less than 10 days but more than 5 days left")
  void when_day_add_then_quality_add_double() {
    BackstagePass backstagePass = new BackstagePass(20, 0, "ticket", 20);
    backstagePass.afterFewDays(15);
    assertEquals(40, backstagePass.getQuality());
  }

  @Test
  @DisplayName("Check quality when less than 10 days but more than 5 days left")
  void when_day_add_then_quality_add_triple() {
    BackstagePass backstagePass = new BackstagePass(20, 0, "ticket", 20);
    backstagePass.afterFewDays(19);
    assertEquals(52, backstagePass.getQuality());
  }

  @Test
  @DisplayName("Check quality when less than 10 days but more than 5 days left")
  void should_equal_to_zero_when_expired() {
    BackstagePass backstagePass = new BackstagePass(20, 0, "ticket", 20);
    backstagePass.afterFewDays(20);
    assertEquals(0, backstagePass.getQuality());
  }
}
