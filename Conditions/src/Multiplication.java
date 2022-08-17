import java.util.*;

public class Multiplication {
    public static void MultiplyNumber(int a, int b){
        int multiply = a * b;
        System.out.println(" Multiplicaion is : " + multiply);

    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        MultiplyNumber(a,b);
    }
}

