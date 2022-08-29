import java.rmi.StubNotFoundException;
import java.util.*;

public class Operators {
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
        //  int a= 10;
        //  int b= -20;
        //  int c= 1;
        //     // AND oprator
        //  System.out.println("AND " + (a&b)); 
        //     // OR operator
        //  System.out.println("OR "+(a|b));
        //    // EXOR operator
        //  System.out.println("XOR "+(a^b));
        //    //NOT operator
        //  System.out.println("NOT of a "+ (~a));
        //    //NOT formula = -(x+1) 
        //  System.out.println("NOT of c "+ (~c));
        //  System.out.println("NOT NOT of c "+ (~(~c)));
        //    //Bitwise left shft opeartion 
        //  System.out.println("Bitwise left shift operation of 'a' by 1 is " + (a<<1));
        //     // Bitwise right shift operation 
        //  System.out.println("Bitwise right shift operation of 'a' by 1 is " + (a>>1));

//Assignment operators
        
          // int a = 10;
          //  // a = a + 1;
          // System.out.println("+= " + ( a += 1));
          // // a = a - 1;
          // System.out.println("-= " + ( a -= 1));
          // // a = a * 1;
          // System.out.println("*= " + ( a *= 1));
          // // a = a ^ 1;
          // System.out.println("^= " + ( a ^= 1));
          // // a = a << 1;
          // System.out.println("<<= " + ( a <<= 1));
          // // a = a >> 1;
          // System.out.println(">>= " + ( a >>= 1));
          
        // int a = 10;
        //    // a++ = 10 not 11 as it is post increment operator
        // int b = a++ * 5; 
        // System.out.println(b);


/*Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
 *   F(n) = F(n-1) + F(n-2), 
    Where, F(1) =  0, 
           F(2) = 1
 */
          System.out.println("enter nth number ");
          int n = sc.nextInt();
          // System.out.println("number to find at position ");
          // int findNum = sc.nextInt();
          int a = 0;
          int b = 1, c;
          //we took i = 2 cause , we already declared a nd b i.e. first two numbers
          for(int i =2; i<= n ; i++){
            // System.out.print(a+" ");
              c = a+b; 
              a = b;
              b = c;
          }
          System.out.println(a);
    }
}
