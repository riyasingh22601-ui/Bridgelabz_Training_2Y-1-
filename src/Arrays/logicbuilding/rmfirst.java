package Arrays.logicbuilding;

public class rmfirst {
    static int m1(int arr[]) {
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }


    static void main(String[] args) {
        int arr[]= {1,2,3,4,3,2};
        System.out.println(m1(arr));
    }
}
