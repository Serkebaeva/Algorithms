package org.algorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class ContainsDuplicate {
  private static final Logger logger = Logger.getLogger(ContainsDuplicate.class.getName());

  public boolean containsDuplicate(int[] nums) {

    Set<Integer> arrNumWithoutDuplicates = new HashSet<>();

    for (int num : nums) {
      // if doesn't add, then duplicate is found..
      if (!arrNumWithoutDuplicates.add(num)) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    ContainsDuplicate test = new ContainsDuplicate();
    int[] array1 = {5, 4, 3, 4, 5, 1};
    int[] array2 = {1, 4, 3, 2, 6, 7};
    logger.info(() -> String.format("Result: %b", test.containsDuplicate(array1)));
    logger.info(() -> String.format("Result: %b", test.containsDuplicate(array2)));
  }
}
