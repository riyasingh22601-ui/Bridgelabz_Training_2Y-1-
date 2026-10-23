package String.practice;

import java.util.Scanner;

public class frequency {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for(int i =0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(freq[ch] != 0){
                System.out.println(ch + " occurs " + freq[ch] + "tims");
                freq[ch]=0;
            }
        }
        sc.close();
    }
}
