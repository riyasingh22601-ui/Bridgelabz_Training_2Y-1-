package Arrays.Methods;

import java.util.Scanner;

public class Palindrome_Number {
    static void palindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rem = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev)
            System.out.println("pal no");
        else
            System.out.println("not a pal no");
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        palindrome(num);
        sc.close();
    }

    }

