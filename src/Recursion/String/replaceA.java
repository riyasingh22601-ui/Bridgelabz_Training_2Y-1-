package recurison.String;

import java.util.Scanner;

public class replaceA {
    static String replaceA(String s, int i) {

        // Base case
        if (i == s.length()) {
            return "";
        }

        char ch = s.charAt(i);

        // Replace 'a' with 'b'
        if (ch == 'a') {
            ch = 'b';
        }

        // Recursive call
        return ch + replaceA(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        System.out.println("Result: " + replaceA(s, 0));

        sc.close();
    }
}

