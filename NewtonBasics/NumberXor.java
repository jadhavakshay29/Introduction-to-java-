package NewtonBasics;
import java.util.*;

/*Problem Statement
We need a problem on xor again. Given an array A of N integers (1- indexed),
 you need to find the sum of (N- i) xor A[i] for all i from 1 to N.

Input
The first line of the input contains an integer N, the number of elements of the array.
The second line of the input contains N singly spaced integers of the array A[i]. 

i/p - 5
      5 4 7 8 5
o/p - 28 */


public class NumberXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long [n];
        long result =0;
      
        for(int i =0 ; i<n; i++){
           arr[i] =sc.nextLong();
           result += (n-i-1)^arr[i];  
        }
      System.out.println(result);
          
    }

}
