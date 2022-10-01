package NewtonBasics;
import java.util.*;

public class MinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        // int minValue = arr[0];
        // for(int i =0; i<n; i++){
        //     if(arr[i] <minValue){
        //         minValue = arr[i];
        //     }
        // }
        // System.out.println("minimum value is "+minValue);


        //or another aproach is 
        //  int ans = 0;
        //  for(int i =0; i<n; i++){
        //     ans = Math.min(arr[0],arr[i]);
        //  }
        //  System.out.println(ans);

         //or another approach is using Integer.MAX_VALUE
        int x = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i]<x){
                x = arr[i];
            }
        }
        System.out.println("minimum value is "+x);

    }
}
