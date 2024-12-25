package org.algorithms;

import java.util.Arrays;
import java.util.logging.Logger;

public class ValidAnagram {
  private static final Logger logger = Logger.getLogger(ValidAnagram.class.getName());

  public boolean isAnagram(String s, String t) {
    // Convert strings to Character Arrays
    char[] sArray = s.toLowerCase().toCharArray();
    char[] tArray = t.toLowerCase().toCharArray();

    // Sort the arrays
    Arrays.sort(sArray);
    Arrays.sort(tArray);

    return Arrays.equals(sArray, tArray);
  }

  public static void main(String[] args) {
    ValidAnagram test = new ValidAnagram();
    String s = "anagram";
    String t = "nagaram";
    logger.info(() -> String.format("" + test.isAnagram(s, t))); // Expected output: true
    String s2 = "car";
    String t2 = "rat";
    logger.info(() -> String.format("" + test.isAnagram(s2, t2))); // Expected output: false
  }
}
