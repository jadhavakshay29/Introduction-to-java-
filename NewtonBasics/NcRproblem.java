package NewtonBasics;
import java.util.*;

// find the NcR 
//fromula = n!/r!(n-r)!

public class NcRproblem {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
//1 approach 
//one way but its taking way too lines and loops which leads to more space and time complexity 


    //     int n = sc.nextInt();
    //     int r = sc.nextInt();
    //     int factN = 1;
    //     int factR = 1;
    //     int factNR = 1;
    //  //calculating n factorial
    //     for(int i=1 ; i<=n; i++){
    //         factN = factN*i;
    //     }
    //  // factorial of r
    //     for(int i=1 ; i<=r; i++){
    //         factR = factR*i;
    //     }
    // // factorial of n-r 
    //     for(int i=1 ; i<=n-r; i++){
    //         factNR = factNR*i;
    //     }

    //     int result = factN/(factR*factNR);
    //     System.out.println("NcR is "+result);


    // second and more optimized approach is making function and use it 
           int n = sc.nextInt();
           int r = sc.nextInt();
           //calling of function 
           int factN = factorial(n);
           int factR = factorial(r);
           int factNR = factorial(n-r);

           int result = factN/(factR*factNR);
           System.out.println("factorial is "+result);
          
    }

     public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact *= i;
        }
       return fact;
    
    }
    }
