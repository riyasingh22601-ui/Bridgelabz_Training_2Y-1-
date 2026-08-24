package Arrays;

import java.util.Scanner;

public class CountDigit {
    static void countDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("Number of digits="+count);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        countDigit(num);
    }
}
