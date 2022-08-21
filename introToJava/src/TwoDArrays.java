import java.util.*;

public class TwoDArrays {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        //array declaration for rows and cols
        int numbers[][] = new int[rows][cols];

        //taking input for row
        for (int i = 0; i < rows; i++) {
            //taking input for cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        //for output we have to find the index at which given no is present
        for (int i = 0; i <numbers.length; i++) {  //or for (int i = 0; i < rows ; i++)
            for (int j = 0; j < numbers[i].length; j++) {  // or for (int j =0; j< cols; j++)
                if (numbers[i][j] == x) {
                    System.out.println("x found at index " + "i" + "["+ i + "]" + "j" + "[" + j + "]");
                }
            }
        }
    }
}