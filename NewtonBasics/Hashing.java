package NewtonBasics;
import java.util.*;

public class Hashing {
    public static void findDuphashing(int arr[], int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i =0; i<n; i++){
            if(hm.containsKey(arr[i])){
                int count = hm.get(arr[i]);
                hm.put(arr[i], count+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> x: hm.entrySet()){
            if(x.getValue()>1){
                System.out.println(x.getKey()+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0; i<n; i++){
            arr[i] =sc.nextInt();
        }

        findDuphashing(arr,n);
    }
}
