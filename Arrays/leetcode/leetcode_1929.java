package Arrays.leetcode;

public class leetcode_1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int answer[]=new int[2*n];

        for(int i = 0;i<nums.length;i++){
            answer[i]=nums[i];

        }
        int index = nums.length;
        for(int i =0;i<nums.length;i++){
            answer[nums.length+i]= nums[i];

        }
        return answer;

    }
}
