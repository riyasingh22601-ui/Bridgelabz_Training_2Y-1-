package recurison.String;

import java.util.Scanner;

public class count {
    static int countChar(String s, char ch, int i) {
        if (i == s.length()) {
            return 0;
        }

        int count = 0;
        if (s.charAt(i) == ch) {
            count = 1;

        }
        return count + countChar(s, ch, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        System.out.println("Enter the character to count:");
        char ch = sc.next().charAt(0);

        int result = countChar(s, ch, 0);

        System.out.println("Occurrences: " + result);

        sc.close();
    }
}
