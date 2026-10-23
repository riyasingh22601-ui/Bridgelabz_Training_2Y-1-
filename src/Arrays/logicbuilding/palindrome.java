package Arrays;
import java.util.Scanner;
public class palindrome {
    public static boolean ispalidrome(int n) {
        if(n<0){
            return false;
        }
        int orignal = n;
        int rev =0;
        while(n>0){
            int lastdigit = n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        return(orignal==rev);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int inputno = scanner.nextInt();
        if(ispalidrome(inputno)){
            System.out.println("number is palindeome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
