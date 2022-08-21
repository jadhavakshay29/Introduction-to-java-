import java.util.*;

public class Odd_even {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("even number");
        }else if(a % 2 != 0){
            System.out.println("odd number");
        }else{
            System.out.println("invalid number");
        }
        System.out.println("thank you");
    }
}
