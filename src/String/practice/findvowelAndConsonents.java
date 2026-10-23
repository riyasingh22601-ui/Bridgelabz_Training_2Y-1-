package String.practice;

import java.util.Scanner;

public class findvowelAndConsonents {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int v = 0;
        int c = 0;

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("vowels"+ v);
        System.out.println("consonents"+ c);
    }
}
