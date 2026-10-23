package Arrays.leetcode;

public class leetcode_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int [] ans = new int[n];
        for(int i = 0;i<n;i++){
            for(int j = n-1;j>index[i];j--){
                ans[j]=ans[j-1];
            }
            ans[index[i]]=nums[i];
        }
        return ans;
    }
}
