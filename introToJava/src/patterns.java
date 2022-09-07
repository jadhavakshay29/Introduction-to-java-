import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// square pattern
//  1 1 1 1
//  2 2 2 2
//  3 3 3 3
//  4 4 4 4
        // int n= sc.nextInt();
        // for(int i = 1; i<=n; i++){ //outer loop is for rows
        // for(int j=1; j<=n; j++){ //inner loop is for main operation
        // System.out.print(" "+i);
        // }
        // System.out.println();
        // }

//  1 2 3 4 5
//  1 2 3 4 5
//  1 2 3 4 5
//  1 2 3 4 5
//  1 2 3 4 5
        // int n= sc.nextInt();
        // for(int i = 1; i<=n; i++){
        // for(int j=1; j<=n; j++){
        // System.out.print(" "+j);
        // }
        // System.out.println();
        // }

//  4 3 2 1
//  4 3 2 1
//  4 3 2 1
//  4 3 2 1
        // int n= sc.nextInt();
        // for(int i = 1; i<=n; i++){
        // for(int j=n; j>=1; j--){
        // System.out.print(" "+j);
        // }
        // System.out.println();
        // }

// traingular pattern
//  1  
//  1 2
//  1 2 3
//  1 2 3 4

        // int n= sc.nextInt();
        // for(int i = 1; i<=n; i++){
        // for(int j=1; j<=i; j++){ // j<=i; main condn
        // System.out.print(" "+j);
        // }
        // System.out.println();
        // }

//  1  
//  2 3
//  4 5 6
//  7 8 9 10  

        // int n = sc.nextInt();
        // int p = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        // System.out.print(" " + p); // addn of p in code is mai condn or logic behind soln   
        //      p++;
        //   }
        //      System.out.println();
        // }


//  1  
//  2 3
//  3 4 5
//  4 5 6 7
//  5 6 7 8 9    

        // int n= sc.nextInt();
        // for(int i = 1; i<=n; i++){
             // main logic behind soln
        // int p =i;
        // for(int j=1; j<=i; j++){
        // System.out.print(" "+p);
        // p++;
        // }
        // System.out.println();
        // }

// 1   
// 2 1 
// 3 2 1
// 4 3 2 1        

        // int n = sc.nextInt();
        // for(int i =1; i<=n; i++){
        // for(int j=i; j>=1; j--){ //main logic behind the soln
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

// alphabet patterns

// ABCD
// ABCD
// ABCD
// ABCD        
//         int n = sc.nextInt(); //no of rows and cols
//         for(int i= 1; i<=n; i++){
//         for(int j=1; j<=n; j++){
//         char alpha = (char)('A' +j-1); //main logic behind soln aslo expicit
//        // conversion as j is int and ans in char
//         System.out.print(alpha);
//         }
//         System.out.println();
//         }

// A 
// BB
// CCC
// DDDD        
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         char alpha = (char) ('A' + i - 1); //main logic behind soln 
        //         System.out.print(alpha);
        //     }
        //     System.out.println();
        // }
// A   
// B C 
// C D E
// D E F G
// E F G H I

        // int n=sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     int p = i;
        //     for(int j=1; j<=i; j++){
        //         char alpha = (char)('A'+p-1);
        //         System.out.print(alpha+" ");
        //         p++;
        //     }
        //     System.out.println();
        // }

//imp nd somewhat different one from others

//Q. 
// E
// DE
// CDE
// BCDE
// ABCDE

        // int n = sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //     char alpha = (char)('A'+n-i);  //main logic behind soln
        //     for(int j= 1; j<=i; j++){
        //         System.out.print(alpha);   //thid also
        //         alpha = (char) (alpha + 1);   //and this one 
                
        //     }
        //     System.out.println();
        // }

//mirror patterns

//    *
//   **
//  ***
// ****

        //  int n = sc.nextInt();
        //  //outer loop for rows        
        //  for(int i = 1; i<=n; i++){
        //     //inner loop for spaces
        //      for(int j=1; j<=n-i; j++){
        //          System.out.print(" ");
        //      }
        //      //outer loop for value printing 
        //      for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //      }
        //      System.out.println();
        //  }

//          1
//         12
//        123
//       1234
//      12345        
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j= 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

// inverted triangle

        // int n = sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

//Q. 4444
// 333
// 22
// 1
        // int n= sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(n-i+1);
        //     }
            
        //     System.out.println();
        // }

//different approach

        //  int n = sc.nextInt();
        //  for(int i=n; i>=1;i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        //  }


//Q.
    //      1 
    //     121
    //    12321
    //   1234321
    //  123454321

        // int n = sc.nextInt();
           //loop for rows
        // for(int i = 1; i<=n; i++){
            //loop for spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
           //loop for left half of pattern
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
           //loop for right half of pattern
        //     for(int j=i-1; j>=1;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

    //      * 
    //     ***
    //    *****
    //   *******
    //  *********
        // int n= sc.nextInt();
        // //loop for rows
        // for(int i=1; i<=n; i++){
        //     //loop for spaces
        //     for(int j=1; j<=n-i; j++){
        //           System.out.print(" ");
        //     }
        //     //loop to print left half 
        //     for(int j=1; j<=i; j++){
        //           System.out.print("*");
        //     }
        //     //loop to print right half 
        //     for(int j=i-1; j>=1; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


//Q.  1 
//   232
//  34543
// 4567654        
        // int n = sc.nextInt();
              //loop for rows
        // for(int i=1; i<=n; i++){
              //loop for spaces
        //     for(int j=1; j<n-i; j++){
        //         System.out.print(" ");
               
        //       }
        // int p =i; 
              //loop for left side of numbers to print
        // for(int j=1; j<=i; j++){
        //     System.out.print(p);
        //     p++;
        // }   
             //loop for right sid to print
        // for(int j=(2*i-2); j>=i; j--){
        //     System.out.print(j);
        // }
        // System.out.println();            
        // }


    //      * 
    //     ***
    //    *****
    //   *******
    //   *******
    //    *****
    //     ***
    //      *

        // int n = sc.nextInt();
        // //for rows
        // for(int i=1; i<=n; i++){
        //     //for spaces
        //     for(int j=1; j<=n-i; j++){
        //        System.out.print(" ");
        //     } 
        //     //for priting upper half
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();   
        // }
        // //for second part 
        // for(int i=n; i>=1; i--){
        //     //for spaces
        //     for(int j=1; j<=n-i; j++){
        //        System.out.print(" ");
        //     }
        //     //for printing lower part
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

// *
// *^*
// *^^*
// *^^^*
// ******
                int N = sc.nextInt();
           System.out.println("*");
               for(int i =0; i<N-2; i++){
                  System.out.print("*");
   
             for(int j =0; j<=i; j++){
                  System.out.print("^");
               }
                 System.out.println("*");
                }
             for(int i =1; i<N+2; i++){
                  System.out.print("*");
                }

    }
}
