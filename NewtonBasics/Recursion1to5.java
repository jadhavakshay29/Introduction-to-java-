package NewtonBasics;
public class Recursion1to5 { 
    // function 
    public static void printnum(int n){
        //base condition 
        if(n==6){
            return;
        }  
        System.out.println(n); //print
        printnum(n+1); //recursion 
    }
//driver code 
  public static void main(String[] args) {
       int n = 1;
       printnum(n);
  }

}
