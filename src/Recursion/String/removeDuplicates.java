package recurison.String;

import java.util.Scanner;

public class removeDuplicates {
    static String removeDuplicates(String s, int i, String result) {
        // Base case
        if (i == s.length()) {
            return result;
        }

        char ch = s.charAt(i);

        // Add only if the character is not already present
        if (result.indexOf(ch) == -1) {
            result = result + ch;
        }

        return removeDuplicates(s, i + 1, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        System.out.println(
                "After removing duplicates: "
                        + removeDuplicates(s, 0, "")
        );

        sc.close();
    }
}

