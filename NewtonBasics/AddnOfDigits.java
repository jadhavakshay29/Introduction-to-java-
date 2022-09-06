package NewtonBasics;

import java.util.Scanner;

public class AddnOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int rem,sum=0;
        while(n!=0){
            // in number 1234%10 gives 4 i.e.remender, and get 4 out of 1234  
            rem = n%10;
            // in number 1234/10 gives 123 i.e. last digit is deducted 
            n = n/10;
            sum = sum + rem;
            
        }
        System.out.println("Sum of digits is "+sum);
    }
}
