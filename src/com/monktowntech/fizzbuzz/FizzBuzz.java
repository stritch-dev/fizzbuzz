package com.monktowntech.fizzbuzz;
public class FizzBuzz {

  public String play(String numberAsString) {
    int number = Integer.parseInt(numberAsString);
    if (number % 3 == 0
        && number % 5 == 0
        && number % 7 == 0) {
      return "fizz_buzz_pop";
    } else if (number % 3 == 0 && number % 5 == 0) {
      return "fizz_buzz";
    } else if (number % 3 == 0 && number % 7 == 0) {
      return "fizz_pop";
    } else if (number % 5 == 0 && number % 7 == 0) {
      return "buzz_pop";
    } else if (number % 3 == 0) {
      return "fizz";
    } else if (number % 5 == 0) {
      return "buzz";
    } else if (number % 7 == 0) {
      return "pop";
    }
    return numberAsString;
  }
}

