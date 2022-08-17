import java.util.*;
/* Q.  Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
*/
public class Marks {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter command"); // 1 for in 0 for out
           int input = sc.nextInt();

           if (input == 1){
               System.out.println("Enter marks");
               int  m = sc.nextInt();
               if (m <= 100 && m >= 90) {
                   System.out.println("this is good");
               } else if (89 >= m && m >= 60) {
                   System.out.println("this is also good");
               } else if (59 >= m && m >= 0) {
                   System.out.println("This is good as well");
               } else {
                   System.out.println("invalid marks");
               }
           }else if ( input ==0){
               System.out.println("you are out\nThank you");
               break;
           }
        }
    }
}