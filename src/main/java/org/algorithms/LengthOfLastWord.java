package org.algorithms;

import java.util.logging.Logger;

class LengthOfLastWord {
  private static final Logger logger = Logger.getLogger(LengthOfLastWord.class.getName());

  public static int lengthOfLastWord(String s) {
    String[] arr = s.split(" ");
    String lastWord = String.valueOf(arr[arr.length - 1]);

    return lastWord.length();
  }

  public static void main(String[] args) {
    logger.info(() -> String.format("%d", lengthOfLastWord("Hello World")));
  }
}
