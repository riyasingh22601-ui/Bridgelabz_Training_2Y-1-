package Arrays;
import java.util.*;
public class calculator {
   public static double add(double a,double b){
       return a+b;
   }
    public static double sub(double a,double b){
        return a-b;
    }
    public static double mul(double a,double b){
        return a*b;
    }
    public static double div(double a,double b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter A =");
        double a = scanner.nextDouble();

        System.out.println("enter B =");
        double b = scanner.nextDouble();
        System.out.println("addition :"+add(a,b));
        System.out.println("subtration :"+sub(a,b));
        System.out.println("multiplication :"+mul(a,b));
        System.out.println("division:"+div(a,b));

    }
}
