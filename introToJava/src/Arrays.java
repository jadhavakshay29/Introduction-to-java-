/* Q. take an array of names as an input from user
      and print that on screen
 */
import java.util.*;

public class Arrays {
   public static void main(String arg[]){
       Scanner sc = new Scanner(System.in);
      // char[] name = sc.next().toCharArray();
      int size = sc.nextInt();
       String name[] =  new String[size];

       // input
       for (int i = 0; i < size; i++){
           name[i] = sc.next();
       }

       for (int i = 0 ; i< size; i++){
           System.out.println(name[i]);

       }
       main(null); //for continuation of program
   }
}
