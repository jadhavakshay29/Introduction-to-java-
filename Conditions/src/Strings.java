import java.util.*;

public class Strings {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
       //simple printing String output
        String firstName = sc.next();
        String lastName = sc.next();
        
        //Concatenation - joins two strings 
        String addName = firstName + " " + lastName;
        System.out.println("concatenation function output :"+addName);

        //charAt function - prints the char of o/p seperately
        for (int i = 0 ; i< firstName.length(); i++){
            System.out.println( "charAt function output :"+firstName.charAt(i));

        }
         //compareTo function - compares strings 
         if(firstName.compareTo(lastName)==0){
            System.out.println("Strings are equal");
         }else{
            System.out.println("Strings are not equal");
         }
         
         /*substring function-
        returns the char that we want by 
         taking begining and ending index*/

         String subString= addName.substring(7);
         System.out.println(""+subString);
         
    }
}
