package String.practice;

import java.util.Scanner;

public class substring {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String result = str.substring(start,end);
        System.out.println(result);
    }
}
