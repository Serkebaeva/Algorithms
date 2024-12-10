package org.algorithms;

import java.util.Arrays;

public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    // The edge case when nums1 is empty
    if (m == 0) {
      for (int i = 0; i < n; i++) {
        nums1[i] = nums2[i];
      }
      return;
    }

    // Merge the arrays from the end
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[k--] = nums1[i--];
      } else {
        nums1[k--] = nums2[j--];
      }
    }
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    MergeSortedArray test = new MergeSortedArray();
    test.merge(nums1, 3, nums2, 3);
    System.out.println(Arrays.toString(nums1)); // Expected result [1, 2, 2, 3, 5, 6]
  }
}
