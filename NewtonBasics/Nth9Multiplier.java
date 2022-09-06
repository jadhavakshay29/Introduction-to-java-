package NewtonBasics;
import java.util.Scanner;

//nth table of nine
public class Nth9Multiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int a = 3;
        int b = 9;
        if(n==1){
            System.out.println(a);
        }
        for(int i = 2; i<=n; i++){
            if(b%9==0){
              System.out.println(b);
            }
            b=b+9;
        }
    }
}
