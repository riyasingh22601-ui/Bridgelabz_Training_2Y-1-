package Arrays.leetcode;
import java.util.*;
public class leetcode_977 {
    public static  int[] sortedSquares(int[] nums) {
        Scanner sc = new Scanner(System.in);
        int[] nums= sc.nextInt();
        for(int i =0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
