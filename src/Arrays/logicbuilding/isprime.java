package Arrays;
import java.util.*;
public class isprime {
    public static boolean isprime(int n) {
        if(n<=1){
            return false;
        }
        for(int i = 2;i*i <=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number :");
        int num = scanner.nextInt();
        if(isprime(num)){
            System.out.println("number is prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
