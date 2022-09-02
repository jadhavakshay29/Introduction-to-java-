import java.util.*;

public class ReverseNumber {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int x;
        while(n>0){
            x= n%10;
            rev = rev *10+x;
            n = n/10;
            
        }
        System.out.println(rev);
    }
}
