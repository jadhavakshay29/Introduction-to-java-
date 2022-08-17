import java.util.*;

public class Equal {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        } else if (a > b) {

            System.out.println("a is greater than b");
        }else if (a < b){
            System.out.println("a is less than b");
        }else {
            System.out.println("invalid number");
        }
    }
}
