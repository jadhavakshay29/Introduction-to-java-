package NewtonBasics;
import java.util.*;

public class SuperPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = (n/2)+1; i<=n; i++){
            System.out.print(i+" ");
        }
    }
}
