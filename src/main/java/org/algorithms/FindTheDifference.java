package org.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

class FindTheDifference {
  private static final Logger logger = Logger.getLogger(FindTheDifference.class.getName());

  public static char findTheDifference(String s, String t) {
    List<Character> arrayList = new ArrayList<>();

    for (char ch : t.toCharArray()) {
      arrayList.add(ch);
    }

    for (char ch : s.toCharArray()) {
      arrayList.remove(Character.valueOf(ch));
    }

    return arrayList.get(0);
  }

  public static void main(String[] args) {
    logger.info("" + findTheDifference("abcd", "abcdr"));
  }
}
