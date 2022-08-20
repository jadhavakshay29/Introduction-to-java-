import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Data types-

    //1byte --> 8bit
    //bit means binary numbers are stored in 0 and 1 each of them called bits
    // int a = 5;  // 4 byte 
    // short b = 8;  //2 byte memory storage i.e. 16 bit memory
    // byte c= 8;   //1byte
    // long d =4;  // 8 byte hence can store more precise value
    // double e = 23.5; // 8 bytes, double takes decimal values also has high precesion
    // float f = 29.5f;  // we write f for float value to get recognize
     
    // char name = 'a';  // 2byte memory storage 
    // boolean b1 = true; //boolean only takes either true or false value
    // boolean b2 = false;
    // System.out.println("sum of all integer data types \n"+ (a+b+c+d+e+f));

    // //how to fetch character 
    // String str= sc.nextLine();
    // char ch = str.charAt(2);
    // System.out.println(ch);
 
//swapping of numbers -->

    // int a =5;
    // int b = 3;
    // int temp;
    // temp = a; 
    // a = b;     
    // b = temp;
    // System.out.println(a);
    // System.out.println(b);

//char storing -->

    //  char ch = 'a';  //ASCII value of 'a' is 97 so system will get 97 + 3 & will print 100
    //  int b = 3;
    //  int add = 'a'+ b;  //this is valid too 
    //  System.out.println(add);
 
//type conversion -->

     //  char ch = 'a';
    //  int b = 5;
    //  int i = ch;  /*this is called implicit conversion 
    //                  in this 2 byte char is being saved in 4 byte memory so no data will be lost */
    //  char expli = (char)b; // this is called explicit conversion 
                       /*so char has 2 byte and int has 4 byte so char can't really be able to store 
                        * 4 byte integer value so it'll show error 
                        but; if we use (char) before it we'll be forcing char to store integer in it; and
                        it'll store it but some data will be lost;
                        so avoid this
                        */
      // int a = (int)5.3;  // explicit converison   
      // System.out.println(a);  // but the output will be 5 only 

    //   double a = 6/4; // a is double so it'll store the double value but 6 and 4 are int so thier ans wil
    //                   //be an int value i.e. 1 but will get stored in double a as 1.0 
    //   int b = 6/4;  
    //   double c = a+b;  // c = 1.0 + 1 =2.0
    //   System.out.println(c); // o/p is 2.0

    // double a = 55.5;
    // a = a % 10;  
    // System.out.println(a); //o/p is 5.5

//Q. to find out wether the character is uppercase, lowercase or not a character.
     
    //  System.out.println("enter character: ");
    //  String name = sc.next();
    //  char ch = name.charAt(0);

    //  if(ch >= 97 && ch <= 122){
    //     System.out.println(ch+ " is lower character");
    //  }else if( ch >= 65 && ch <=90){
    //     System.out.println(ch +" is uppercase character");
    //  }else{
    //     System.out.println(ch+ " is not a character");
    //  }
    
    // int x=5;
    // int y=5;
    // while((x=5)==y)
    // {
    //     System.out.println("Hello");
    //     x++;
    //     y++;
    // }
    /*here the output will get print only one time cause
      x==5 will always be 5 in line 88  */ 

//sum of n numbers -->      

    //   int n = sc.nextInt();
    //   int sum = 0;
    //   for(int i =1; i<=n; i++){
    //        sum = sum+i;
    //   }
    // System.out.println("sum of n numbers is "+ sum);

//Fahrenheit to Celsius Table

/*Q. Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W),
 you need to convert all Fahrenheit values from Start to End at the gap of W, into their
  corresponding Celsius values and print the table.*/
  
    int startF = sc.nextInt();  // startF --> starting value of fahrenheit
    int endF = sc.nextInt();  // endF --> end value of fahrenheit
    int g = sc.nextInt();   //gap 
    double c;
        while(startF <= endF){
             c = (startF-32)* 5/9;
             //int d = (int)c;
             System.out.println(startF+ " "+c);
             startF= startF + g;
        }
    
}
}