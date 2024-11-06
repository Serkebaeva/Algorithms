package org.algorithms;

import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int temp = nums.length-1;

        while(temp > 0) {
            if(nums[temp] == nums[temp-1]) {
                return true;
            }
            temp--;
        }

        return false;
    }


    public static void main(String[] args) {
        ContainsDuplicate test = new ContainsDuplicate();
        int[] array1 = {5, 4, 3, 4, 5, 1};
        System.out.println(test.containsDuplicate(array1));
    }
}
