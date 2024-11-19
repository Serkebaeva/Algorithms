package org.algorithms;

public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          return true;
        }
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
