package NewtonBasics;
import java.util.*;
//https://www.geeksforgeeks.org/java-math-abs-method-examples/

public class QueensAttack{
    public void main(String[] arg){
        Scanner sc = new Scanner(System.in);
//check if king is in attack position of queen or not if 


        int qR = 1, qC = 1;
        int oR = 3, oC = 2;
        //fucntion calling
    if (canQueenAttack(qR, qC, oR, oC)){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}

//new function
static boolean canQueenAttack(int qR, int qC,
                                int oR, int oC)
{
    // If queen and the opponent
    // are in the same row
    if (qR == oR)
        return true;
 
    // If queen and the opponent
    // are in the same column
    if (qC == oC)
        return true;
 
    // If queen can attack diagonally
    if (Math.abs(qR - oR) == Math.abs(qC - oC))
        return true;
 
    // Opponent is safe
    return false;
}
}
