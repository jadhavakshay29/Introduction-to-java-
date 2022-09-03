package NewtonBasics;
import java.util.*;

/*Natsu is fighting with a dragon that has A Health and B attack power and Natsu has
 C health and D attack power. The fight goes in turns first Natsu will attack the
Dragon then Dragon will attack Natsu and this goes on. The fight will stop when
either the dragon's or Natsu's health drops zero or below. Your task is to check whether
 Natsu will able to slay the Dragon or not.
  
 Return 0 if Dragon wins else return 1.*/ 


public class dragonSlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  A = sc.nextInt();
        int  B = sc.nextInt();
        int  C = sc.nextInt();
        int  D = sc.nextInt();
        
        int result = dragon(A,B,C,D);
        System.out.println(result);

    }

    static int dragon(int A, int B, int C,int D){
        while(A>0 && C>0){
       A = A-D;
       if(A<=0){
           return 1;
       }
        C = C-B;
        if(C<=0){
           return 0;
        }
    }
    return 0;  
    }
}


