package org.algorithms;

public class RepeatedSubstringPattern {

  public boolean repeatedSubstringPattern(String s) {
    // Create a new string by concatenating s with itself
    String str = s + s;

    // Create a substring of 'str' that excludes the first and last characters - This step is
    // crucial because it prevents matching s itself as a trivial case.
    // And check if the original string 's' is present in the substring
    return str.substring(1, str.length() - 1).contains(s);
  }

  public static void main(String[] args) {
    RepeatedSubstringPattern test = new RepeatedSubstringPattern();
    System.out.println(test.repeatedSubstringPattern("abab"));
    System.out.println(test.repeatedSubstringPattern("aba"));
    System.out.println(test.repeatedSubstringPattern("abcabcabc"));
  }
}
