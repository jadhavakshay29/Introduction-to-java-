package NewtonBasics;
import java.util.*;

public class NumberOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);

    }
    static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
     
        // This is checked so
        // that we can skip
        // middle five numbers
        // in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;
     
        for (int i = 5; i * i <= n; i = i + 6){
            if (n % i == 0 )
                return false;
            if ( n % (i + 2) == 0)
                return false;    
        }
        return true;
    }
     
    // Function to print primes
    static void printPrime(int n)
    {
        int count =0;
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
                // System.out.print(i + " ");
                count++;
        }
         System.out.print(count);
    }
    }

  
