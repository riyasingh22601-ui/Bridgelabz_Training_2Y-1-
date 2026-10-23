package Recursion.basic;

public class printno {
    public static void print(int n ) {
        //base case
        if (n == 1) {
            System.out.print(n + " ");
            return;

        }
        // Recursive Work
        print(n - 1);
        // self work
        System.out.print(n + " ");
    }
        public static void Dec(int n){
            if(n==1){
                System.out.print(n+"");
                return;
            }
            System.out.print(n+" ");
            Dec(n-1);

    }
    static void main(String[] args) {
        print(50);
        Dec(50);
    }
}
