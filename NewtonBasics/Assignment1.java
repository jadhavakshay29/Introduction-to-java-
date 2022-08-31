
package NewtonBasics;
import java.util.*;
import java.math.*;

public class Assignment1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*Given an array A of size N. You need to find the root mean square (RMS) of the array
 i. e you first need to square all values of array and take its mean. Then you need to
  return the square root of mean. Print the answer with precision upto 6 decimal places. */

        // //n is size of an array
        // int size = sc.nextInt();
        // int[] rms = new int[size];
        // double addn=0;
        // double sRoot=0;

        // //input of array
        // for(int i =0; i<size; i++){
        //       rms[i]= sc.nextInt();
        //       //squaring of numbers in array
        //       rms[i]= rms[i]*rms[i];
        // }
        // //output of array
        // for(int i = 0; i<size; i++){
        //     // addn of squared numbers
        //     addn = addn + rms[i];    
        // }
        // //sRoot is squre root of mean 
        // sRoot =Math.sqrt(addn/size);
        // System.out.format("%.6f", sRoot); 

//Area of square         

        // int side = sc.nextInt();
        // int area;
        // area = side *side;
        // System.out.println(area);

//Percentage finding        

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int d = sc.nextInt();
        // int percentage;
        //     percentage = ((a+b+c+d)*100)/400;
        // System.out.println(percentage);

//triangular star pyramid pattern

        int n= sc.nextInt();
        //outer loop for rows 
          for(int i = 1; i<=n; i++){
              //inner loop for star printing
              for(int j =1; j<=i; j++){
                  System.out.print("*");
              }
             System.out.println();
       } 
}
}