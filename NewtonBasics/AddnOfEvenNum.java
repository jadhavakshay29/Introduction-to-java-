
package NewtonBasics;
import java.util.*;

//Addition of n even numbers 

public class AddnOfEvenNum {
    public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum=0;
       for(int i = 0; i<n; i+=2){
        sum = sum + (i);

    }
    System.out.println(sum);
  }
}