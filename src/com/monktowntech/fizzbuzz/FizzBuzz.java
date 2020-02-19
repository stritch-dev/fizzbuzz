package com.monktowntech.fizzbuzz;

public class FizzBuzz {

  public static void main(String[] args) {
  }

  public String play(String numberAsString) {
    int number = Integer.parseInt(numberAsString);
    String result = String.valueOf(number);
    if (number % 3 == 0) {
      result = "fizz";
    }
    if (number % 5 == 0) {
      result = "buzz";
    }

    return result;
  }
}

