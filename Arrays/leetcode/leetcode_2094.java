package Arrays.leetcode;

public class leetcode_2094 {
    class Solution {
        public int[] findEvenNumbers(int[] digits) {
            int ans []= new int[1000];
            int k = 0;
            for(int i = 0;i < digits.length;i++){
                for(int j =0;j<digits.length;j++){
                    for(int l = 0;l<digits.length;l++){
                        if(i==j || j==l || l==i){
                            continue;
                        }
                        if(digits[i]==0){
                            continue;
                        }
                        if(digits[l]%2!=0){
                            continue;
                        }
                        int num = digits[i]*100+
                                digits[j]*10+
                                digits[l];


                        boolean duplicate = false;
                        for(int x =0;x<k;x++){
                            if(ans[x]==num){
                                duplicate = true;
                                break;
                            }
                        }
                        if(!duplicate){
                            ans[k++]=num;
                        }
                    }
                }
            }
            Arrays.sort(ans, 0, k);
            return Arrays.copyOf(ans, k);
        }
    }
}
