package Arrays.Methods;

import java.util.Scanner;

public class Calculator {
    static void add(int a, int b) {
        System.out.println("Addition=" + (a + b));
    }

    static void sub(int a, int b) {
        System.out.println("Subtraction=" + (a - b));
    }

    static void mul(int a, int b) {
        System.out.println("Multiplication" + (a * b));
    }

    static void div(int a, int b) {
        System.out.println("Division" + (a / b));
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        if (choice == 1)
            add(a, b);
        else if (choice == 2)
            sub(a, b);
        else if (choice == 3)
            mul(a, b);
        else if (choice == 4)
            div(a, b);
        else
            System.out.println("Invalid choice");
        sc.close();
    }
}


