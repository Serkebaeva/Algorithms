package org.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Logger;

class IntersectionOfTwoArrays {
  private static final Logger logger = Logger.getLogger(IntersectionOfTwoArrays.class.getName());

  public int[] intersection(int[] nums1, int[] nums2) {

    HashSet<Integer> numbers = new HashSet<>();

    Arrays.sort(nums1);
    Arrays.sort(nums2);

    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length; j++) {
        if ((nums1[i]) == (nums2[j])) {
          numbers.add(nums2[j]);
        }
      }
    }

    // Log the result
    logger.info(() -> String.format("%s", numbers));

    // Convert the set to an array
    int[] arr = new int[numbers.size()];
    int n = 0;
    for (int num : numbers) {
      arr[n++] = num;
    }

    return arr;
  }

  public static void main(String[] args) {
    IntersectionOfTwoArrays test = new IntersectionOfTwoArrays();
    int[] arr1 = {4, 9, 5};
    int[] arr2 = {9, 4, 9, 8, 4};
    test.intersection(arr1, arr2);
  }
}
