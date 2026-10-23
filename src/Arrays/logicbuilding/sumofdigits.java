package Arrays;
import java.util.*;
public class sumofdigits {
    public static int SumOfDigits(int n){
        int sum = 0;
        n=Math.abs(n);
        while(n>0){
            int rem=n%10;
            sum = sum+rem;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number :");
        int num = scanner.nextInt();
       int result= SumOfDigits(num);
        System.out.println(""+result);
    }
}

