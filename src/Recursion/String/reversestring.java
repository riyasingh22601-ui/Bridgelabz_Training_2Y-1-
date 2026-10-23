package recurison.String;

import java.util.Scanner;


import java.util.Scanner;

public class reversestring{

    static String reverse(String s, int i) {
        if (i < 0) {
            return "";
        }

        return s.charAt(i) + reverse(s, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String ans = reverse(s, s.length() - 1);

        System.out.println("Reversed string: " + ans);

        sc.close();
    }
}
