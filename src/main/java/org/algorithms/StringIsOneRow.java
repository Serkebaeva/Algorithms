package org.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

class StringIsOneRow {
  private static final Logger logger = Logger.getLogger(StringIsOneRow.class.getName());

  public String[] findWords(String[] words) {
    String row1 = "qwertyuiopQWERTYUIOP";
    String row2 = "asdfghjklASDFGHJKL";
    String row3 = "zxcvbnmZXCVBNM";

    List<String> result = new ArrayList<>();

    for (String word : words) {
      if (isOneRow(word, row1) || isOneRow(word, row2) || isOneRow(word, row3)) {
        result.add(word);
      }
    }

    return result.toArray(new String[0]);
  }

  private boolean isOneRow(String word, String row) {
    for (char c : word.toCharArray()) {
      if (row.indexOf(c) == -1) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    StringIsOneRow test = new StringIsOneRow();
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    logger.info(() -> String.format("%s", Arrays.toString(test.findWords(words))));
  }
}
