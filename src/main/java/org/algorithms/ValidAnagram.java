package org.algorithms;

import java.util.logging.Logger;

public class ValidAnagram {
  private static final Logger logger = Logger.getLogger(ValidAnagram.class.getName());

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] sCharCount = new int[26];
    int[] tCharCount = new int[26];

    // Loop through s
    for (int i = 0; i < s.length(); i++) {
      sCharCount[s.toLowerCase().charAt(i) - 'a']++;
    }

    // Loop through t
    for (int i = 0; i < t.length(); i++) {
      tCharCount[t.toLowerCase().charAt(i) - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
      if (sCharCount[i] != tCharCount[i]) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    ValidAnagram test = new ValidAnagram();
    String s = "anagram";
    String t = "nagaram";
    logger.info(() -> String.format("%b", test.isAnagram(s, t))); // Expected output: true
    String s2 = "car";
    String t2 = "rat";
    logger.info(() -> String.format("%b", test.isAnagram(s2, t2))); // Expected output: false
  }
}
