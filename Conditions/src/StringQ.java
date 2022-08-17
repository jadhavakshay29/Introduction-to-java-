// Q. find the total length of strings of an array
// which is taken input from user

import java.util.*;

public class StringQ{
   // public static void main(String arg []){
   //     Scanner sc = new Scanner(System.in);
   //     int size = sc.nextInt();
   //     String info[] = new String[size];
     

   //     int totalLength = 0;
        
   //     for(int i = 0; i < size ; i++){
   //        info[i] = sc.next();
   //        totalLength = totalLength + info[i].length();
   //     }
          
   //          System.out.println("Length of all strings together is: "+totalLength);
    
   // }
      
   // Q. Take input string from user and if he type k replace it with e.
   // public static void main(String arg[]){
   //    Scanner  sc = new Scanner(System.in);
   //    String input = sc.nextLine();
   //    String result = "";

   //    for( int j = 0 ; j< input.length(); j++){
   //       if( input.charAt(j) == 'k'){
   //          result += 'e';

   //       }else{
   //          result += input.charAt(j);
   //       }

   //    }
   //   System.out.println(result);

   // }
    
   /*Input an email from the user. You have to create a username from the email
    by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123” */
   public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      String email = sc.nextLine();
      
      String result = "";
      for( int i = 0; i< email.length(); i++){
          if(email.charAt(i) == '@'){
              break;
          }else{
            result += email.charAt(i);
          } 
      }
        System.out.println(result);
   }
}
 
  

