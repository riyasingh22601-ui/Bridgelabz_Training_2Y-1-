package recurison.String;

import java.util.Scanner;

public class areEqual {
    static boolean areEqual(String s1, String s2, int i) {
        // Different lengths mean different strings
        if (s1.length() != s2.length()) {
            return false;
        }

        // Base case
        if (i == s1.length()) {
            return true;
        }

        // Compare current characters
        if (s1.charAt(i) != s2.charAt(i)) {
            return false;
        }

        return areEqual(s1, s2, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        if (areEqual(s1, s2, 0)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        sc.close();
    }
}