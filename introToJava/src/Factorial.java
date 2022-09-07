import java.util.*;

public class Factorial {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int fact = 1;
        
        for(int j = 1; j <= m;j++ ){
             fact = fact*j;
        }
        System.out.print(fact);
    }
    }

