package NewtonBasics;
import java.util.*; 

public class QuickSort {
//swapping function 
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;

    }

    public static int partition(int arr[], int l, int r){
        //selecting pivot as  last number in array i.e.arr[r]
         int pivot = arr[r];
         int i = l-1;
         for(int j = l; j<=r-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
         }
         swap(arr,i+1,r);
         return i+1;
    }

    public static void quickSort(int arr[], int l, int r){
        if(l<r){
            int p = partition(arr,l,r);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);
       //output
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
