package Arrays.LogicBuilding;


public class MaxElement {
    public static int maxNumber(int nums[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public static int secondMax(int nums[]) {

        int max = maxNumber(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                nums[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = maxNumber(nums);

        return secondMax;
    }
    public static void main(String[]args){
        int nums[]={1,2,3,4,5};
        System.out.println(maxNumber(nums));
        System.out.println(secondMax(nums));
    }
}
