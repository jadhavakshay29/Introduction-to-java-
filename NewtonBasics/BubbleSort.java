package NewtonBasics;
import java.util.*;

public class BubbleSort {

    public static void bubbleSort(int arr[], int n){
        //using swapping happened will save our time 
        //e.g. if array is already sorted there is no point in checking again and again so we'll simply break out f loop
        boolean swappinghappned = false;
        for(int i =0; i<n-1; i++){
            swappinghappned = false;
            for(int j =0; j<n-i-1; j++){
                // to make decending order sorted array just do arr[j]<arr[j+1];
                if(arr[j]>arr[j+1]){
                    //swap algorithm
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                swappinghappned = true;
            }
            //if swapping is not happening that means loop is already sorted 
            if(swappinghappned == false){
                break;
            }
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        //function call
        bubbleSort(arr, n);
        
        System.out.println("array after bubblesort ");
         for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}


