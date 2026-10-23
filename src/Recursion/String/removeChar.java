package recurison.String;

import java.util.Scanner;

public class removeChar {
    static String removeChar(String s, char ch, int i) {
        // Base case
        if (i == s.length()) {
            return "";
        }

        // Skip the character to be removed
        if (s.charAt(i) == ch) {
            return removeChar(s, ch, i + 1);
}
        return s.charAt(i) + removeChar(s, ch, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        System.out.println("Enter character to remove:");
        char ch = sc.next().charAt(0);

        System.out.println("Result: " + removeChar(s, ch, 0));
        sc.close();
    }
}