package org.algorithms;

import java.util.ArrayList;
import java.util.List;

class FindTheDifference {

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
    System.out.println(findTheDifference("abcd", "abcdr"));
  }
}
