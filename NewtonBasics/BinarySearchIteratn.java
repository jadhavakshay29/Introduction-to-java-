package NewtonBasics;
import java.util.*;

public class BinarySearchIteratn {

    public static int printbinary(int arr[], int n, int k){
        int firstNum = 0; 
        int lastNum = n-1;
        while(firstNum < lastNum){ 

            int middle = firstNum + (lastNum-firstNum)/2;

            if(arr[middle]==k){
                return middle;
            }else if(arr[middle]>k){
                lastNum =  middle-1;
            }else{
                firstNum = middle+1;
            }
            firstNum++;
            lastNum++;
        }
        return 0;
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        System.out.println("Number found at index "+printbinary(arr,n,k));
        if(printbinary(arr, n, k)==0){
            System.out.println("Number not found");
        }
    }
}
