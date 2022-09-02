package NewtonBasics;
import java.util.*;

public class Arena {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
/*Q. rounding off of number */    

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


/* Q. Given a number N for each i (1 < = i < = N), you have to print the number except :-
For each multiple of 3, print "Fizz" instead of the number.
For each multiple of 5, print "Buzz" instead of the number.
For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number */   

        //   int n = sc.nextInt();
        // String mul3 = "Fizz";
        // String mul5 = "Buzz";
        // String mul35 = "FizzBuzz";

        // for(int i=1; i<=n; i++){
        //     if(i%3==0){
        //         System.out.println(mul3);

        //     }else if(i%5==0){
        //         System.out.println(mul5);

        //     }else if(i%3==0 && i%5==0){
        //         System.out.println(mul35);

        //     }else{
        //         System.out.println(i);
        //     }
           
        // }


/*Given a year, find if it is a leap year. Leap year is the year that is multiple of 4. 
But, multiples of 100 which are not multiples of 400 are not leap years. */     

        // int n= sc.nextInt();
        // if((n%4==0 && n%100!=0) || n%400==0){
        //     System.out.println("YES");

        // }else{
        //     System.out.println("NO");
            
        // }

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=10 & b>=10){
             System.out.println(true);
        }else{
            System.out.println(false);
        }

        if(a%2==0 || b%2==0){
            System.out.println(true);
        }else{
        System.out.println(false);
        }
        
        if(a!=b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
       
    }
}
