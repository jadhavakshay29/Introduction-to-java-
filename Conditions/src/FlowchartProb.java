import java.util.*;

public class FlowchartProb {
    public static void main(String[] args) {
//Q. check triangle if it is equilateral, isosceles or scalene

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter sides");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if(a==b && b==c && a==c){
        //     System.out.println("triangle is equilateral triangle");
        // }else if(a==b || b==c){
        //     System.out.println("triangle is isosceles triangle");
        // }else if (a!=b && b!=c && a!=c){
        //     System.out.println("triangle is scalene triangle");

        // }
      
// Q. print sum of n even numbers.
       
    //   Scanner sc = new Scanner(System.in);
    //   System.out.println("print nth number");     
    //   int n = sc.nextInt();
    //   int sum =0;
      
    //   for(int i=1; i<=n; i++){
    //       if(i%2==0){
    //         sum = sum+i;
    //       }
    //   }
    //    System.out.println(sum);

//Q.Find out the greatest common divisor 

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int gcd=0;
    int n;
    if(a>b){
        n =a;
    }else{
        n =b;
    }
    for(int i = 1; i<=n ; i++){
       if(a%i==0 & b%i==0){
          gcd =0+i;
       }
    } 
    System.out.println("gcd is "+gcd);
    }
}
