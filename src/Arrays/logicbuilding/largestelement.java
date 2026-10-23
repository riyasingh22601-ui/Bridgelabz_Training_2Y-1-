package Arrays.logicbuilding;

import java.sql.SQLOutput;

public class largestelement {
    public static int MaxValue(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
               max=arr[i];
            }
        }
        return max;
    }
    public static int secondMax(int arr[]){
        int second = MaxValue(arr);

        for (int i =0;i<arr.length;i++){
            if(arr[i]==second){
                arr[i]=Integer.MIN_VALUE;
            }

        }
        int secondmax= MaxValue(arr);
        return secondmax;
    }

    static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("max element-:"+MaxValue(arr));
        System.out.println("second max-:"+secondMax(arr));
    }
}
