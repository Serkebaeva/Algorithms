package org.algorithms;

import java.util.logging.Logger;

public class ReverseVowelsOfAString {
  private static final Logger logger = Logger.getLogger(ReverseVowelsOfAString.class.getName());

  public String reverseVowels(String s) {
    StringBuilder sb = new StringBuilder(s);
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
      // Find the next vowel from the start
      if (isVowel(sb.charAt(start))) {
        // Find the next vowel from the end
        while (start < end && !isVowel(sb.charAt(end))) {
          end--;
        }

        // Swap the vowels
        char temp = sb.charAt(start);
        sb.setCharAt(start, sb.charAt(end));
        sb.setCharAt(end, temp);

        // Move pointers after swapping
        start++;
        end--;
      } else {
        // Move start pointer forward if not a vowel
        start++;
      }
    }

    return sb.toString();
  }

  private boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
  }

  public static void main(String[] args) {
    ReverseVowelsOfAString test = new ReverseVowelsOfAString();
    logger.info("" + test.reverseVowels("CreAtive")); // Expected output: "CreitAve"
  }
}
