package NewtonBasics;
import java.util.*;

public class GCDFunction{
    // gcd function  
    public static int gcd(int a, int b){
        //corner cases 
        if (a==0){
            return a;
        }
        if(b==0){
            return b;
        }

        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }    
        }
        return a;// or b cause gcd is equal so a=b
    }
    
    //lcm function 
    public static int lcm(int a, int b){
        int gcd = gcd(a,b);
       //corner case 
        if(gcd ==0){
            return 0;
        }
        return a*b/gcd; 
    }
//driver code 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int gcd = gcd(a,b);
        System.out.println("GCD is "+ gcd);
        System.out.println("LCM is "+lcm(a,b));
    }
}
