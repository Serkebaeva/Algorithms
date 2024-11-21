package org.algorithms;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

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
    System.out.println(test.containsDuplicate(array1));
    System.out.println(test.containsDuplicate(array2));
  }
}
