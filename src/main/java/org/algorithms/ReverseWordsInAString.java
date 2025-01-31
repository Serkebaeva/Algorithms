package org.algorithms;

import java.util.logging.Logger;

public class ReverseWordsInAString {
  private static final Logger logger = Logger.getLogger(ReverseWordsInAString.class.getName());

  public String reverseWords(String s) {
    char[] sArray = s.toCharArray();
    StringBuilder sb = new StringBuilder();

    int start = 0;

    // Loop through the Characters in the string
    for (int j = 0; j <= sArray.length; j++) {

      if (j == sArray.length || sArray[j] == ' ') {

        // Reverse the word from start to j-1
        for (int i = j - 1; i >= start; i--) {
          sb.append(sArray[i]);
        }

        // Add a space if it's not the end of the string
        if (j != sArray.length) {
          sb.append(' ');
        }

        // Update the start index for the next word
        start = j + 1;
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    ReverseWordsInAString test = new ReverseWordsInAString();
    logger.info(
        () ->
            String.format(
                "%s",
                test.reverseWords(
                    "Let's take LeetCode contest"))); // Expected output: "s'teL ekat edoCteeL
    // tsetnoc"
    logger.info(
        () -> String.format("%s", test.reverseWords("Mr Ding"))); // Expected output: ""rM gniD""
  }
}
