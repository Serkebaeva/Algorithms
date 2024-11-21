package org.algorithms;

public class IndexOfFirstOccurrenceInAString {

  public int strStr(String haystack, String needle) {
    char[] arrHayStack = haystack.toCharArray();
    char[] arrNeedle = needle.toCharArray();

    for (int i = 0; i <= arrHayStack.length - arrNeedle.length; i++) {
      int j;
      for (j = 0; j < arrNeedle.length; j++) {
        if (arrHayStack[i + j] != arrNeedle[j]) {
          break;
        }
      }

      if (j == arrNeedle.length) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    IndexOfFirstOccurrenceInAString test = new IndexOfFirstOccurrenceInAString();
    String string1 = "sadbutsad";
    String string2 = "sad";
    System.out.println(test.strStr(string1, string2));

    String string3 = "freecodecamp";
    String string4 = "code";
    System.out.println(test.strStr(string3, string4));
  }
}
