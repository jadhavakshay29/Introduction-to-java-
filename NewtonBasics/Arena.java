package NewtonBasics;
import java.util.*;

public class Arena {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char c = sc.next().charAt(0);
        
        //    //rounding float value upto 2 digits 
        // float roundF = Math.round((c*100.0)/100);
        //    //rounding double value upto 4 digits
        // double roundD = Math.round((d*1000)/1000.0);

        System.out.println(i);
        System.out.println(l);
        System.out.format("%.2f",f);
        System.out.println();
        System.out.format("%.4f",d);
        System.out.println();
        System.out.println(c);
       
    }
}
