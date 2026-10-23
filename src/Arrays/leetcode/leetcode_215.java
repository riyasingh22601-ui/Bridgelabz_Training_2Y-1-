package Arrays.leetcode;

public class leetcode_215
{
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
