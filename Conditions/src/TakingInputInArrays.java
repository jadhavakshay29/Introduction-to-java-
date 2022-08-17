import java.util.*;

public class TakingInputInArrays {
    public static void main(String arg []){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int Numbers[] = new int[size];

       //input
        for (int i= 0 ; i < size; i++){
            Numbers[i] = sc.nextInt();
        }
       //output
        for( int i = 0; i< size ;i++){
            System.out.println(Numbers[i]);
        }
    }
}
