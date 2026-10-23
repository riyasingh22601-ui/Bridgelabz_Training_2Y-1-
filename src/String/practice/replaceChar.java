package String.practice;

import java.util.Scanner;

public class replaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String old = sc.nextLine();
        String newword = sc.nextLine();
        String result = sentence.replace(old,newword);
        System.out.println(result);
    }
}
