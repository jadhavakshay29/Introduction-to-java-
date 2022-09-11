package NewtonBasics;
import java.util.*;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         sc.close();
         int i  = 1;
         int gcd=0;
       while(i<=n || i<=m){
            if(n%i==0 && m%i==0){
                gcd=i;
            }
           i++;
        }
        System.out.println(gcd);
    }
}
