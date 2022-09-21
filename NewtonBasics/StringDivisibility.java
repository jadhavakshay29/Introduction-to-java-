package NewtonBasics;
import java.util.*;

public class StringDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum =0;
        int i =0;
       for(; i<s.length(); i++){
           sum += s.charAt(i);

       }
       if(sum%3==0 && s.charAt(s.length()-1)=='0' ){
           System.out.println("Yes");
       }else{ 
           System.out.println("No");
       }
    }
}
