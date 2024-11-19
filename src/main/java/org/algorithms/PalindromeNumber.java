package org.algorithms;

public class PalindromeNumber {
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
    System.out.println(str.isPalindrome(123));
    System.out.println(str.isPalindrome(121));
    System.out.println(str.isPalindrome(-121));
    System.out.println(str.isPalindrome(21));
    System.out.println(str.isPalindrome(11));
  }
}
