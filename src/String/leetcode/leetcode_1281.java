package String.leetcode;

public class leetcode_1281 {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int pro =1;
        while(n>0){
            int digit = n%10;
            sum += digit;
            pro *= digit;
            n /=10;
        }
        return (pro - sum);
    }
}
