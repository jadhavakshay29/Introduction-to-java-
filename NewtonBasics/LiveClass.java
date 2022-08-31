package NewtonBasics;
import java.util.*;

public class LiveClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] dish = new int[n];

        for(int i =0; i< n; i++){
            dish[i] = sc.nextInt();
        }

            System.out.println(dish[0]);
    }
}
