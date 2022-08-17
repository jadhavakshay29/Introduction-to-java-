import java.util.*;

// Q. determine if number is in power of two or not
public class QonBitsManupuln {
    public static void main(String arg[]){
        // Scanner sc = new Scanner( System.in);
        // System.out.println("enter number");
        // int n = sc.nextInt();
        // int pos = 1;
        // int bitMask = 1<<n;

        // if((n & (n-1)) ==0){  
        //      System.out.println("number is in power of 2");
        // }else{
        //     System.out.println("number is not in power of 2");
        // }

        /*logic = if we perform the AND operation of number which in power of 2 lets call it 'n' and 
  'n-1' the bits oupur is oooo which is o. */

// Q. Write a program to toggle a bit a position = “pos” in a number “n”.
        // we toggled i.e. chagned the positions and simply observe and got the output 
    //   Scanner sc =new Scanner(System.in);
    //   int n = 5;
    //   System.out.println("enter position");
    //   int pos = sc.nextInt();
    //   int bitmask = 1<<pos;
    //   int newNumber = bitmask | n;
    //   System.out.println("new number after position toggle is: "+newNumber);

//Q. Write a program to count the number of 1’s in a binary representation of the number.
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("enter number");
    //    int number = sc.nextInt();
    //    int pos = 0;
    //    int bitmask = 0<<number;
       
    //    int newNumber = bitmask | number;
    //    int count = 0;
    //    while(newNumber == 1){
    //       count++;          
    //    }
    //    System.out.println("1's in number given are: "+ count);

//Q. Write 2 functions => decimalToBinary() & 
// binaryToDecimal() to convert a number from one number system to another.    

//Decimal to Binary
//    Scanner sc = new Scanner(System.in); 
//    System.out.println("enter decimal number");
//    int number = sc.nextInt();
//     int index = 0; // index means position in array
//          int array[] = new int[10];
    
//          while(number >0){
//              array[index] = number % 2;
//              index++;
//              number = number/2;

//          }
//          System.out.print("binary number is ");
//          for(int i = index-1 ; i >=0; i--){
//                System.out.print(array[i]);
//          }

// Binary to decimal

Scanner sc = new Scanner(System.in);
System.out.println("enter binary number");
int bin = sc.nextInt();
int i =1, rem, dec = 0;

while(bin !=0){
    rem = bin % 10;
    dec = dec +rem * i;
    i= i * 2;
    bin = bin / 10;
}
System.out.println("decimal number of given binary is "+dec);
    }  
}



