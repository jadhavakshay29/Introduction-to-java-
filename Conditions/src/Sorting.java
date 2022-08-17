import java.util.*;

public class Sorting {
    // function to print output of an array
    public static void printArray( int arr[]){
         for(int i =0 ; i< arr.length; i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
    }
   //bubble sort
   //time complexity = O(n^2)
    public static void main(String arg[]){
    int arr[] = {7,8,3,1,2};

    for(int i = 0; i < arr.length-1 ; i++ ){
        for( int j = 0 ; j< arr.length-i-1; j++){
            //swap i.e. swapping two numbers off their positions after comparing
            if ( arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }    
        } 
    }
    // function call for output pritnting of array
   printArray(arr);
}
}