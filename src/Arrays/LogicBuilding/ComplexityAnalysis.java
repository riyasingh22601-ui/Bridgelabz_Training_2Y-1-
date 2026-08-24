package Arrays.LogicBuilding;

import java.util.Scanner;

public class ComplexityAnalysis {

    static void power(int base, int exp) {
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println("Power = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        power(base, exp);
    }
}