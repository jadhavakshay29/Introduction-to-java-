import java.util.*;

public class Calculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator =  sc.next().charAt(0); /* we can't directly take char value using next(),
                                                 so we have to take charAt(0); to take that char value i.e. A,S,M,D,R;
                                                 A,S,M etc are stored in memory locations like A in 0 , S in 1 , M in 2 etc;
                                                 so that's how it works*/


       switch(operator){
            case 'A':
                int Addition = a + b;
                System.out.println(Addition);
                break;
            case 'S':
                int Subtraction = a - b;
                System.out.println(Subtraction);
                break;
            case 'M':
                int Multiplication = a * b;
                System.out.println(Multiplication);
                break;
            case 'D':
                int Division = a / b;
                System.out.println(Division);
                break;
            case 'R':
                int Remainder = a % b;
                System.out.println(Remainder);
                break;
            default:
                System.out.println("invalid operation");
        }

    }
}
