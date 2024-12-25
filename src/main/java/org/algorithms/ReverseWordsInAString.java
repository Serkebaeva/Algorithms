package org.algorithms;

import java.util.logging.Logger;

public class ReverseWordsInAString {
  private static final Logger logger = Logger.getLogger(ReverseWordsInAString.class.getName());

  public String reverseWords(String s) {
    String[] sArray = s.split(" ");
    StringBuilder sb = new StringBuilder();

    for (String word : sArray) {
      for (int i = word.length() - 1; i >= 0; i--) {
        sb.append(word.charAt(i));
      }
      sb.append(" ");
    }

    return sb.toString().trim();
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
