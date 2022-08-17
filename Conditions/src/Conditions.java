import java.sql.SQLOutput;
import java.util.*;

public class Conditions {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age <= 50 && age >= 18){
            System.out.println("Adult");
        } else if (age < 18) {
            System.out.println("child");

        }else{
            System.out.println("Old");
        }

    }

}
