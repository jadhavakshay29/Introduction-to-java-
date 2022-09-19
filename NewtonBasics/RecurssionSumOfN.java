package NewtonBasics;
//sum of n natural number
public class RecurssionSumOfN {

    public static void printsum(int n, int i, int sum){
         if(i==n){
            sum = sum+i;
            System.out.println(sum);
            return;
         }
        sum = sum+i;
        printsum(n, i+1, sum);
    }
   public static void main(String[] args){
        int i= 1;
        int sum =0; 
        int n =5;
        printsum(n,i,sum);
   }
}
