package NewtonBasics;
import java.util.*;

public class Assignment2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

//fahrenheit to celcius

        // int f = sc.nextInt();
        // int c;
        //  c = ((f-32)*5)/9;
        // System.out.println(c);

//Print each element in a new line in the same order as input.
//Print float round off to two decimal places and double to 4 decimal places.   

        // int i = sc.nextInt();
        // long l = sc.nextLong();
        // float f = sc.nextFloat();
        // double d = sc.nextDouble();
        // char c = sc.next().charAt(0);

        // System.out.println(i);
        // System.out.println(l);
        // System.out.format("%.2f",f);
        // System.out.println();
        // System.out.format("%.4f",d);
        // System.out.println();
        // System.out.println(c);

/*Sara is trying a new magic trick on you, The magic trick goes in 6 steps:-
1. Think of a number X(don't tell Sara)
2. Add A(Given by Sara) to it.
3. Double the sum in your mind.
4. Add an even number B(Given by Sara) to it.
5. Half the amount
6. Subtract the initial number which you had taken from the sum
After this Sara will tell the resulting amount without knowing the initial number, 
can you print the result for her? */        

          int n = sc.nextInt();
          int a = sc.nextInt();
          int result;
          result = (((((n+a))*2)+a)/2)-a;
          System.out.println(result);

     
    }
 }  

