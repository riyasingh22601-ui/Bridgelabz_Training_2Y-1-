package Arrays.Leetcode;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length-1;
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
    }
    public static void reverse(int[]nums, int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }

    static void main(String[] args) {
        RotateArray obj= new RotateArray();
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        obj.rotate(nums,k);
        System.out.println("Rotated Array");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }

    }
}
