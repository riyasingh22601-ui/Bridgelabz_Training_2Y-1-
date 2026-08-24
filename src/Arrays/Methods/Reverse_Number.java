package Arrays.Methods;
import java.util.Scanner;
public class
Reverse_Number {
    static void reverse(int n) {
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("Reverse Number="+rev);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        reverse(num);
    }
}
