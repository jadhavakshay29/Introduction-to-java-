package NewtonBasics;
import java.util.*;
// finding number using 
public class BinarySearch {
// l is first number and r is last number  
    public static void binarySearch(int arr[],int l,int r,int k){ 
        //condition to check if r crosses l or not 
    if(r>=l) {
        //formula to find middle
        int middle = l + (r - l) / 2;
    
        if (arr[middle] == k) {
            System.out.println("Element found at index " + middle);
            return;
        }
        if (arr[middle] > k) {
            //here l i.e. string point remains same and middle comes middle-1; then middle-1 and left's middle number is calculated in resurive manner 
            binarySearch(arr, l, middle - 1, k);
        } else {
            //here  middle-1 and right's middle number is calculated in ressurive manner 
            binarySearch(arr, middle + 1, r, k);
        }
    }
    else {
        System.out.println("Element not found");
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();

        binarySearch(arr,0,n-1,k);
    }
 
}