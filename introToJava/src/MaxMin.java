import java.util.*;

public class MaxMin {
    public static void main(String arg[]){

        int number[] = {6,2,5,4,1,8,4};

        int max = number[0] ;
        int min = number[1];
        for (int i = 0; i < number.length ; i++) {
            if (number[i] > max) {
                max = number[i];

            }else if( number[i] < min){
              min = number[i];
            }
            }
        System.out.println("maximum number is "+max+"\n" +"minimun value is " +min);

        System.out.println(Integer.MAX_VALUE);
        }}

