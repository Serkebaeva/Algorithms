package org.algorithms;

public class RepeatedSubstringPattern {

  public boolean repeatedSubstringPattern(String s) {
    // Create a new string by concatenating s with itself
    String str = s + s;

    StringBuilder substr = new StringBuilder();

    // Loop through str and add characters to substring (excluding first and last characters)
    for (int i = 1; i < str.length() - 2; i++) {
      substr.append(str.charAt(i));
    }

    int start = 0; // Initialize start index for checking
    int end = substr.length() - 1; // Initialize end index for checking

    // Iterate through the substring
    for (int j = 0; j < substr.length() - 1; j++) {
      // Check if the current character of the substring matches the start
      if (substr.charAt(j) != s.charAt(start)) {
        continue;
      }

      // While both characters match from the start and the end
      while (start <= end && substr.charAt(j) == s.charAt(start)) {
        start++; // Move start index forward
        end--; // Move end index backward

        // If both indices meet, we've matched a repeated pattern
        if (start > end) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    RepeatedSubstringPattern test = new RepeatedSubstringPattern();
    System.out.println(test.repeatedSubstringPattern("abab")); // expected outcome true
    System.out.println(test.repeatedSubstringPattern("aba")); // expected outcome false
    System.out.println(test.repeatedSubstringPattern("abcabcabc")); // expected outcome true
  }
}
