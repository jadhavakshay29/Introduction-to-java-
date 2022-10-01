package NewtonBasics;
import java.util.*;

public class SumOfCubes {

    public static String isCube(int n){
       int l=0;
       int r=0;
       while(l<r){
        int m = (l+r)/2;
        int a = (int) Math.pow(m,3);
        if((a+a)==n){
            return "YES";
        }else if((a+a)>n){
            l= m-1;
        }else{
            r = m+1;
        }
        l++;
        r++;
       }
       return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isCube(n));
    }
}



// public static String isCube(int a, int b, int n){
//     for(int i =1; i*i<n; i++){
//         for(int j =1; j*j<n; j++){
//             a = (int)Math.pow(i,3);
//             b =(int) Math.pow(j,3);
//             if((a+b)==n){
//                 return "YES";
//             }
//         }
//     }
//     return "NO";
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int a=0;
//     int b=0;

//     System.out.println(isCube(a,b,n));
// }