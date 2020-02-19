package com.monktowntech.fizzbuzz;

public class FizzBuzz {

  public String play(String numberAsString) {
    int number = Integer.parseInt(numberAsString);
    String result = String.valueOf(number);
    if (number % 3 == 0 && number % 5 == 0) {
      result = "fizz_buzz";
    } else if (number % 3 == 0) {
      result = "fizz";
    } else if (number % 5 == 0) {
      result = "buzz";
    }

    return result;
  }
}

