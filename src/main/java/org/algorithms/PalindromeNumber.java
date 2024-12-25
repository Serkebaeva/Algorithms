package org.algorithms;

import java.util.logging.Logger;

public class PalindromeNumber {
  private static final Logger logger = Logger.getLogger(PalindromeNumber.class.getName());

  public boolean isPalindrome(int x) {
    if (x < 0) return false;

    int givenNumber = x;
    int reversedNumber = 0;

    while (x != 0) {
      int digit = x % 10;
      reversedNumber = reversedNumber * 10 + digit;
      x /= 10;
    }

    return givenNumber == reversedNumber;
  }

  public static void main(String[] args) {
    PalindromeNumber str = new PalindromeNumber();
    logger.info(() -> String.format("" + str.isPalindrome(123)));
    logger.info(() -> String.format("" + str.isPalindrome(121)));
    logger.info(() -> String.format("" + str.isPalindrome(-121)));
    logger.info(() -> String.format("" + str.isPalindrome(21)));
    logger.info(() -> String.format("" + str.isPalindrome(11)));
  }
}
