package Arrays.Methods;

import java.util.Scanner;

public class FebonacciSeries {
    static void fib(int n){
        int a=0,b=1,c;
        for(int i=0;i<=n;i++){
            System.out.println(a+"");
            c=a+b;
            a=b;
            b=c;
        }
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n=sc.nextInt();
        fib(n);
        sc.close();



    }
}
