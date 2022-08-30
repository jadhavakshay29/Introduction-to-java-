
package NewtonBasics;
import java.util.*;
import java.math.*;

public class Assignment1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//find RMS of of values taken form user in array 

        //n is size of an array
        int size = sc.nextInt();
        int[] rms = new int[size];
        double addn=0;
        double sRoot=0;
        double result =0;

        //input of array
        for(int i =0; i<size; i++){
              rms[i]= sc.nextInt();
              //squaring of numbers in array
              rms[i]= rms[i]*rms[i];
              
        }
        //output of array
        for(int i = 0; i<size; i++){
            // addn of squared numbers
            addn = addn + rms[i];
            
        }
        //sRoot is squre root of mean 
        sRoot =Math.sqrt(addn/size);
        result =Math.round(sRoot*1000000)/1000000.0;
        System.out.println(result);
        
        
        

    }  
   }




