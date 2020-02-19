package com.monktowntech.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzFeatureOneTest {
  static String FIZZ = "fizz";
  static String BUZZ = "buzz";
  static String FIZZ_BUZZ = "fizz_buzz";
  FizzBuzz fb = new FizzBuzz();

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

  @Test
  public void _315_returns_fizz_buzz() {
    assertEquals(FIZZ_BUZZ, fb.play("315"));
  }
}
