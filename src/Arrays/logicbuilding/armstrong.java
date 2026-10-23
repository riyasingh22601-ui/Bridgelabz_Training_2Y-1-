package Arrays;

public class armstrong {
    public static int count(int n) {
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static boolean isarm(int n){
        int orignal = n;
        int sum = 0;
        int d = count(n);
        while(n>0){
           int rem=n%10;
            sum = (int)(sum +Math.pow(rem,d));
            n=n/10;
        }
        if(orignal==sum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println( isarm(n));

    }
}
