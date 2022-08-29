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
          // System.out.println("enter nth number ");
          // int n = sc.nextInt();
          // // System.out.println("number to find at position ");
          // // int findNum = sc.nextInt();
          // int a = 0;
          // int b = 1, c;
          // //we took i = 2 cause , we already declared a nd b i.e. first two numbers
          // for(int i =2; i<= n ; i++){
          //   // System.out.print(a+" ");
          //     c = a+b; 
          //     a = b;
          //     b = c;
          // }
          // System.out.println(a);

// for loop variations 
          // int n = 4;
          //   // use of comma, semi colon and AND,OR operators is given to assign two int in 1 loop 
          // for  (int i = 1,j =1 ; i<=n || j<=n ; i++, j+=20){
          //      System.out.println("i "+ i + " j " + j);
          // }
          
// USE OF BREAK KEYWORD
// 1 
// 12
// 123
// 1234 
        //  int n = 5; 
        //      int i = 1; //1st loop assigning 
        // while(i<=n){    
        //      int j = 1;  // 2nd loop assigning
        // while(j<=n){
        //   // break statement will create pyramid pattern nd 1st line will be blank space cause i==j 
        //   //satisfies the if codn and it breaks the loop 
        //       if(i ==j){   
        //         break;
        //       }
        //     System.out.print(j);
        //          j++;
              
        //      }
        //          i++;
        //      System.out.println();
        //  }
         
// same code as above just we have used for loop 
        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //   for (int j = 1; j<=n; j++){
        //       // here because of break and i ==j codn we get 1st space blank (dry run code to understand)
        //       // to get rid of that blank space codn would be (i+1==j) 
        //     if(i==j){
        //       break;
        //     }
        //     System.out.print(j);
        //   }
        //   System.out.println();
        // }
       
//USE OF CONTINUE KEYWORD 
      // int n = 7;
      // for(int i =1; i<=n; i++){
      //   if (i ==3){
      //     continue;
      //   }
      //     System.out.println(i);
      // }      


//prime numbers between 2 to nth number 

      // System.out.println("enter nth number ");
      // int n = sc.nextInt();
      // System.out.println("prime numbers between 2 to "+ n +" are ");
      //    for(int i =2; i<=n; i++){
  
      //           if(i%2==0 || i==3 || i<1 || i%3==0 ){
      //              continue;
      //           }
                
      //           System.out.println(i);
      //     }
         
/*Write a program that asks the user for a number N and a choice C. And then give them the
 possibility to choose between computing the sum and computing the product of all 
 integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes) */   
 
 
        // System.out.println("enter nth number ");
        // int n = sc.nextInt();
        // System.out.println("choose 1 for addition and 2 for multiplicatn ");
        //  //taking c as a choice betn 1 and 2
        // int c = sc.nextInt();
        // int sum =0, multiply=1;

        // // loop for addn or multiplication till n numbers
        // for(int i = 1; i<=n ;i++){
        //     if (c==1){
        //       //condn for addn of n numbers
        //         sum += i;
        //     }else if(c==2){
        //       // condn for multiplication of n numbers
        //         multiply *= i;
        //     }else{
        //       System.out.println("-1");
        //       break;
        //     }
        //  }
        //  if(c==1){
        //   System.out.println(sum);
        //  }else{
        //   System.out.println(multiply);
        //  }

/*Write a program to print first x terms of the series 3N + 2 which are not multiples of 4. */        
          
        System.out.println("enter nth number ");
        int n= sc.nextInt();
        int AP;
        for (int i=1; i<=n; i++){
            AP = 3*i+2;
            if(AP%4==0){
               continue;
            }
            System.out.print(AP+" ");
        }

        
       }
    }

