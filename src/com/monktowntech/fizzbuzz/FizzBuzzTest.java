package com.monktowntech.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzFeatureOneTest {
  static String FIZZ = "fizz";
  static String BUZZ = "buzz";
  static String FIZZ_BUZZ = "fizz_buzz";
  static String POP = "pop";
  static String FIZZ_POP = "fizz_pop";
  static String BUZZ_POP = "buzz_pop";
  static String FIZZ_BUZZ_POP = "fizz_buzz_pop";
  FizzBuzz fb = new FizzBuzz();

  // Feature 1
  // numbers
  @Test
  public void _1_returns_1() {
    assertEquals("1", fb.play("1"));
  }

  @Test
  public void _2_returns_2() {
    assertEquals("2", fb.play("2"));
  }

  @Test
  public void _4_returns_4() {
    assertEquals("4", fb.play("4"));
  }

  // fizz
  @Test
  public void _3_returns_fizz() {
    assertEquals(FIZZ, fb.play("3"));
  }

  @Test
  public void _9_returns_fizz() {
    assertEquals(FIZZ, fb.play("9"));
  }

  @Test
  public void _123_returns_fizz() {
    assertEquals(FIZZ, fb.play("123"));
  }

  // buzz
  @Test
  public void _5_returns_buzz() {
    assertEquals(BUZZ, fb.play("5"));
  }

  @Test
  public void _20_returns_buzz() {
    assertEquals(BUZZ, fb.play("20"));
  }

  @Test
  public void _200_returns_buzz() {
    assertEquals(BUZZ, fb.play("200"));
  }

  // fizz buzz
  @Test
  public void _15_returns_fizz_buzz() {
    assertEquals(FIZZ_BUZZ, fb.play("15"));
  }

  @Test
  public void _45_returns_fizz_buzz() {
    assertEquals(FIZZ_BUZZ, fb.play("45"));
  }
  // @Test public void _315_returns_fizz_buzz() { assertEquals(FIZZ_BUZZ, fb.play("315")); }

  // Feature 2
  // pop
  @Test
  public void _7_returns_pop() {
    assertEquals(POP, fb.play("7"));
  }

  @Test
  public void _28_returns_pop() {
    assertEquals(POP, fb.play("28"));
  }

  @Test
  public void _77_returns_pop() {
    assertEquals(POP, fb.play("77"));
  }

  // fizz pop
  @Test
  public void _21_returns_fizz_pop() {
    assertEquals(FIZZ_POP, fb.play("21"));
  }

  @Test
  public void _63_returns_fizz_pop() {
    assertEquals(FIZZ_POP, fb.play("63"));
  }

  @Test
  public void _126_returns_fizz_pop() {
    assertEquals(FIZZ_POP, fb.play("126"));
  }

  // buzz pop
  @Test
  public void _35_returns_buzz_pop() {
    assertEquals(BUZZ_POP, fb.play("35"));
  }

  @Test
  public void _70_returns_buzz_pop() {
    assertEquals(BUZZ_POP, fb.play("70"));
  }

  @Test
  public void _140_returns_buzz_pop() {
    assertEquals(BUZZ_POP, fb.play("140"));
  }

  // fizz buzz pop
  @Test
  public void _105_returns_fizz_buzz_pop() {
    assertEquals(FIZZ_BUZZ_POP, fb.play("105"));
  }

  @Test
  public void _210_returns_fizz_buzz_pop() {
    assertEquals(FIZZ_BUZZ_POP, fb.play("210"));
  }

  @Test
  public void _315_returns_fizz_buzz_pop() {
    assertEquals(FIZZ_BUZZ_POP, fb.play("315"));
  }
}
