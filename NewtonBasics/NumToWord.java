package NewtonBasics;
import java.util.*;

public class NumToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //cause we have done taking input we closed the scanner class
        sc.close();

        char eachNo;
        //convert int to string
        String str = Integer.toString(n);
        for(int i = 0; i<str.length() ; i++){

            //taking one number from string seperately and checking with words representation in loop
            eachNo = str.charAt(i);
            
            switch(eachNo){
                case '0' : System.out.print("zero ");
                break;
                case '1' : System.out.print("one ");
                break;
                case '2' : System.out.print("two ");
                break;
                case '3' : System.out.print("three ");
                break;
                case '4' : System.out.print("four ");
                break;
                case '5' : System.out.print("five ");
                break;
                case '6' : System.out.print("six ");
                break;
                case '7' : System.out.print("seven ");
                break;
                case '8' : System.out.print("eight ");
                break;
                case '9' : System.out.print("nine ");
                break;

            }
        }
    }
}
