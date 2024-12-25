package org.algorithms;

import java.util.logging.Logger;

/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
*/

public class SingleNumber {
  private static final Logger logger = Logger.getLogger(SingleNumber.class.getName());

  public int singleNumber(int[] nums) {
    int temp = 0;
    for (int n : nums) {
      temp ^= n; // XOR -> bitwise operation that makes pairs of identical numbers reduce to 0 when
      // XORed. The unique number is the one that doesn’t find a pair.
    }
    return temp;
  }

  public static void main(String[] args) {
    SingleNumber test = new SingleNumber();
    int[] arr = {4, 1, 2, 1, 2};
    logger.info(() -> String.format("%d", test.singleNumber(arr))); // Expected output: 4
  }
}
