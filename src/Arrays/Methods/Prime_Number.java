package Arrays.Methods;

import java.util.Scanner;

public class Prime_Number {
    static void prime(int n){
        int count=0;
        for(int i=0;i<=n;i++){
            if(n%i==0){
                count++;

            }
        }
        if(count==2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a prime number");
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        prime(n);
        sc.close();
    }
}
