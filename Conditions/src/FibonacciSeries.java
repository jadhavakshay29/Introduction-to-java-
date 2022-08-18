import java.util.*;
// Fibonacci Series
public class FibonacciSeries {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.println("enter nth number");
      int n = sc.nextInt();
      int a = 0;
      int b = 1, c;
      System.out.println(" fibonschhi series is ");
      while(a <n){
          System.out.println(a);
          c = a + b;
          a = b;
          b = c;
      }
       System.out.println("thank you");
    }
}

