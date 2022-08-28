public class Operators {
    public static void main(String[] arg){
         int a= 10;
         int b= -20;
         int c= 1;
            // AND oprator
         System.out.println("AND " + (a&b)); 
            // OR operator
         System.out.println("OR "+(a|b));
           // EXOR operator
         System.out.println("XOR "+(a^b));
           //NOT operator
         System.out.println("NOT of a "+ (~a));
           //NOT formula = -(x+1) 
         System.out.println("NOT of c "+ (~c));
         System.out.println("NOT NOT of c "+ (~(~c)));
    }
}
