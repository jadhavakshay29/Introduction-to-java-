package NewtonBasics;
import java.util.*;
/*You are given a matrix Mat of m rows and n columns. The matrix is boolean so 
the elements of the matrix can only be either 0 or 1.
Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. 
After doing the mentioned operation, you need to print the modified matrix. 
Input:
2
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
1 2
0 0

Output:
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
0 0*/
public class BooleanMatrix {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
         for(int k =1; k<=t; k++){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int arr[][] = new int[n][m];
                int flag[] = new int[n];
    
                for(int i =0; i<n; i++){
                    for(int j = 0; j<m; j++){
                        arr[i][j]= sc.nextInt();
                        if(arr[i][j]==1){
                            flag[i]=1;
                        }
                    }
                }
                
                for(int i =0; i<n; i++){
                    for(int j = 0; j<m; j++){
                        if(flag[i]==1){
                            arr[i][j]=1;                        
                        }
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
                
              }
         }
}
