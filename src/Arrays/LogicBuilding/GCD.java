package Arrays.LogicBuilding;

import java.util.Scanner;

public class GCD {
    static void findGCD(int a,int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD=" + a);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        findGCD(num1,num2);
    }
}
