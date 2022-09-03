package NewtonBasics;
import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char name1 = sc.next().charAt(0);
        char name2 = sc.next().charAt(0);

        if(name1=='R' || name2=='R'){
            System.out.println("R");
        }
        else if(name1=='J' || name2 =='J'){
              if(name1=='J'){
                  System.out.println(name2);
              }else if(name2=='J'){
                System.out.println(name1);
              }
             
         }else{
             System.out.println("D");
         }
    }
}
