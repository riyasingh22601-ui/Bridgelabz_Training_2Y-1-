package recurison.String;

import java.util.Scanner;

public class vowel {
    static int countVowel(String s,int i ) {
        if (i == s.length()) {
            return 0;
        }
        char ch = Character.toLowerCase(s.charAt(i));
        int count = 0;


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count = 1;
        }
        return count + countVowel(s, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        int result = countVowel(s, 0);

        System.out.println("Total vowels: " + result);
    }
}
