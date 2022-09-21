package NewtonBasics;
import java.util.*;
// Print all the characters of the string at odd positions.

public class OddCharString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        for(int i = 0; i<s.length(); i++){
            //taking i%2 cause indexing start form 0 so 2 is odd position in case of Strings
            if(i%2==0){
                System.out.print(s.charAt(i));
            }
        }

    }
}
