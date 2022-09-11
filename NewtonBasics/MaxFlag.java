package NewtonBasics;
import java.util.*;

public class MaxFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n]; //1st array 00000
        int brr[] = new int [m];
        int i=0;
        for(; i<n; i++){ // array 1
            arr[i]=0;
        }
        int j=0;
        for(; j<m; j++){ // array 2
            brr[j]= sc.nextInt();
        }

        for(int k=0; k<n; k++){
            if(1 <= arr[i] && arr[i] <= n){
                arr[j] = arr[i] +1;
                System.out.println(arr[j]);
            }else if(arr[j]==n+1){
                arr[i] = arr[j];
                System.out.println(arr[i]);
            }
            

        }

        

        

    }
}
