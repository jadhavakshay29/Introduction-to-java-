package NewtonBasics;
import java.util.*;

public class FindRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double root1,root2;

        double d = (b*b) - (4*a*c);
        if(d>=0){
            root1 = (-b + Math.sqrt(d)) / (2*a);
            root2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.format("%.2f\n%.2f", root1, root2);

        }else if(d==0){
            root1 = root2 = -b / (2*a);
            System.out.format("%.2f\n%.2f", root1);

        }else{
            double real = -b /(2*a);
            double imaginary = Math.sqrt(-d)/ (2*a);
            System.out.format("%.2f+i%.2f\n",real , imaginary);
            System.out.format("%.2f-i%.2f",real , imaginary);


        }

    }
}
