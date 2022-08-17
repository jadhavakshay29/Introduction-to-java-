import java.util.*;

public class Prime {
    // prime number program but not fully optimised i.e cant work on exception like 11,33 etc 
    // public static void main(String arg[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter number");
    //     int n = sc.nextInt();
      
    //     if(n==1){
    //         System.out.println("number is nor prime nor composite"); 
    //     }
    //     else if(n%2==1){
    //         System.out.println("Number is prime number");
    
    //     }

    //     else{
    //         System.out.println("This number is not prime number");
    //     }
    // }
  
 // final fully optimised code for prime number
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        boolean result = primeNumber(n);
        sc.close();
        if(result){
            System.out.println("number is prime number");
        }else{
            System.out.println("number is not prime number");
        }
    }
 
//new function for conditions
public static boolean primeNumber(int n){
    if (n<=1)return false ;
    if (n==2 || n== 3) return true;
    if (n%2 == 0) return false ;
    for ( int i=3; i <=n; i+=2){
        if (n%i==0) return false; 
    }
     return true;
}
}

