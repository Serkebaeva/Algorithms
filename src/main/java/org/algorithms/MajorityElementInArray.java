package org.algorithms;

import java.util.Arrays;
import java.util.logging.Logger;

public class MajorityElementInArray {
  private static final Logger logger = Logger.getLogger(MajorityElementInArray.class.getName());

  public static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int count = 0;
    int n = (nums.length / 2);
    int majorityElement = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = 1; j < nums.length - 1; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }

      if (count > n) {
        majorityElement = nums[i];
      }
    }

    return majorityElement;
  }

  public static void main(String[] args) {
    int[] arr = {2, 2, 1, 1, 1, 2, 2};
    logger.info(() -> String.format("%d", majorityElement(arr)));
  }
}
