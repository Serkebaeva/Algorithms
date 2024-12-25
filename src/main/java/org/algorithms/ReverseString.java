package org.algorithms;

import java.util.Arrays;
import java.util.logging.Logger;

class ReverseString {
  private static final Logger logger = Logger.getLogger(ReverseString.class.getName());

  public void reverseString(char[] s) {
    int start = 0;
    int end = s.length - 1;

    char i;
    while (start < end) {
      i = s[start];
      s[start] = s[end];
      s[end] = i;

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    ReverseString test = new ReverseString();
    char[] arr = {'h', 'e', 'l', 'l', 'o'};
    test.reverseString(arr);
    logger.info(Arrays.toString(arr));
  }
}
