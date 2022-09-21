package NewtonBasics;
import java.util.*;

public class LinearSearching {
//function to find number in array 
    public static void findNum(int arr[], int n, int k){
        for(int i =0; i<n; i++){
            if(arr[i]==k){
                System.out.println("number found at index "+ i);
                return;
            }               
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        findNum(arr,n,k);

    }
}
