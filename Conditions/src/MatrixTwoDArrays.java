// Q. make one matrix using numbers taken from user 

import java.util.*;

public class MatrixTwoDArrays{
    public static void main (String arg []){
        Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();
         int cols = sc.nextInt();

       int numbers[][] = new int [rows][cols];
       
       //rows
       for (int i =0; i < rows; i++){
        // cols
        for(int j = 0; j < cols; j++){
            numbers[i][j] = sc.nextInt();
        }
       }
         System.out.println("matris is : ");     
       //output
       for(int i = 0; i< rows; i++){
        for(int j = 0; j< cols; j++){
            System.out.print(" "+numbers[i][j]);
        }
        System.out.println(" ");
       }
 
    }
}