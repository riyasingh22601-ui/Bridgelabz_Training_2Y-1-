package Arrays.Leetcode;

import java.util.Arrays;

public class Leetcode_414 {

    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int count = 1;

        for (int i = nums.length - 1; i > 0; i--) {

            if (nums[i] != nums[i - 1]) {
                count++;
            }

            if (count == 3) {
                return nums[i - 1];
            }
        }

        return nums[nums.length - 1];
    }

    public static void main(String[] args) {

        Leetcode_414 obj = new Leetcode_414();

        int[] nums = {2, 2, 3, 1};

        System.out.println(obj.thirdMax(nums));
    }
}


