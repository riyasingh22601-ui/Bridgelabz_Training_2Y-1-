package Arrays.logicbuilding;

public class PairSum {
    public static int pairCount(int arr[],int target)
    {
        int Paircount=0;
        for(int i = 0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    Paircount++;
                }
            }
        }
        return Paircount;
    }
    public static int tripleCount(int arr[],int target){
        int triplecount=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        triplecount++;
                    }
                }
            }

        }
        return triplecount;
    }

    static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int target = 9;
        System.out.println("pairsums-:"+pairCount(arr,target));
        System.out.println(("triplesums-:"+tripleCount(arr,target)));
    }

}
