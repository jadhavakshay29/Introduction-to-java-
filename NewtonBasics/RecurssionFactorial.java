package NewtonBasics;

public class RecurssionFactorial {
    //new function 
    public static int fact(int n){
        //base case
        if(n==1 || n==0){
            return 1;
        }//rescurssion
        int factR = n * fact(n-1);
        return factR;
    }

    public static void main(String[] args) {
        int n = 5;
       int ans= fact(n);
        System.out.println(ans);
    }
}
