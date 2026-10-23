package recurison.String;

import java.util.Scanner;

public class palidrome {
    static boolean palidrome(String s, int left, int right) {

        // Base case
        if (left >= right) {
            return true;
        }

        // Check characters
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Recursive call
        return palidrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        if (palidrome(s, 0, s.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}

