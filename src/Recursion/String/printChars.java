package recurison.String;

import java.util.Scanner;

public class printChars {
    static void printChars(String s, int i) {
        if (i == s.length()) {
            return;
        }
        System.out.println(s.charAt(i));
        printChars(s, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        printChars(s, 0);
    }
    }
