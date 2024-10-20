package majorityElementinArray;

import java.util.Arrays;

public class Main {
          public static int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int count = 0;
            int n = (int) (nums.length / 2);
            int majorityElement = 0;

            for(int i = 0; i < nums.length; i++) {
                for(int j = 1; j < nums.length - 1; j++) {
                    if(nums[i] == nums[j]) {
                        count++;
                    }
                }

                if(count > n) {
                    majorityElement = nums[i];
                }
            }

            return majorityElement;

        }

        public static void main(String[] args) {
            int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
            System.out.println(majorityElement(arr));
        }


}