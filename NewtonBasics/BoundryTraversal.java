package NewtonBasics;
import java.util.*;

public class BoundryTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //loop for test cases
         for(int i =1; i<=t; i++){
             int n = sc.nextInt();
             int m = sc.nextInt();
            //array instantiation 
             int arr[][] = new int[n][m];
             //taking array input 
             for(int k = 0; k<n; k++){
                 for (int j=0; j<m; j++){
                     arr[k][j]= sc.nextInt();
                 }
             }
             //new function for bondry traversal i.e. bounfry elements
             boundryTraversal(n,m,arr);
             System.out.println();
             
         }
    }
//new function 
    public static void boundryTraversal(int n, int m, int arr[][]){
        //firstn row
         for(int i =0; i<m; i++){
             System.out.print(arr[0][i]+" ");
         }
         //last column
         for(int i =1; i<n; i++){ 
             System.out.print(arr[i][m-1]+" ");
         }
         //last row
         if(n>1){ // codn for single row or 1D array
             for(int i =m-2; i>=0; i--){
                 System.out.print(arr[n-1][i]+" ");
            }
        }
         //first column
         if(m>1){ // condn for single row or 1D array
         for(int i =n-2; i>=1; i--){
             System.out.print(arr[i][0]+" ");
         }
        }
    }
 }

 