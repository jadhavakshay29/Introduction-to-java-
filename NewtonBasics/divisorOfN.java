package NewtonBasics;
import java.util.*;
//Given an integer N, the task is to find the number of divisors of N which are divisible by 2.
//Input:
// 2
// 9
// 8

// Output
// 0
// 3


public class divisorOfN {
     public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        //no of test cases to be taken 
        int t = sc.nextInt();
        // to perform test cases we just do all our coding inside one loop 
        for(int i= 1; i<=t; i++){
            int n = sc.nextInt();
            //new functin to find dividor of n number only divisible by 2
            divByTwo(n);
            System.out.println();

        }
     }
     
     //new function 
     public static void divByTwo(int n){
      // int count =0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
               //n%i for n =100, is 1, 2, 5, 10, 20, 25, 50, 100
               if(i==n/i && i%2==0 ){
                  //i for 100 is 1, 100
                  System.out.print(i+" ");
                  //count++;
               }else{
                     if(i%2==0){
                        System.out.print(i+" ");
                        //here i will give 100 only as 1 is not divisible by 2
                       // count++;
                     }
                        if((n/i)%2==0){
                          System.out.print(n/i+" ");
                          //n/i will give 2, 50, 4, 20, 10  
                        //   count++;
                       }
                 
               }              
        }
      }
      // System.out.println(count);

   }
}
// to get the count of the numbers just use count and count ++ instead of sout statements