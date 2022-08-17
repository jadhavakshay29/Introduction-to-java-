import java.util.*;

public class BitManupulation{
    public static void main(String arg[]){
//get bit    
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter number");
        // int n = sc.nextInt(); // take n =5, binary of number will be 0101
        // int pos = 2; // 2nd pos of 5 is 1 which we have to find
        // int bitMask = 1 << pos;

        // if((bitMask & n) == 0){
        //     System.out.println("bit is zero");
        // }else{
        //     System.out.println("bit is one");
        // }
//set bit
    //    int n = 5;
    //    int pos = 1;
    //    int bitmask = 1 << pos;

    //    int newNumber = bitmask | n; //
    //    System.out.println("new number after set bit is "+newNumber);

//clear bit  

    //  int n = 5;
    //  int pos = 2;
    //  int bitMask = 1<<pos;

    //  int newNumber = ((~bitMask) & n);
    //  System.out.println("new number after clear bit is: "+newNumber);

//update bit
    Scanner sc = new Scanner(System.in);
    int n = 5;
    int pos = 1;
    int bitmask = 1<<pos;
    int oper = sc.nextInt(); // 1 for set and 0 for clear
    sc.close();
    if(oper == 1){
        //set
        int newNumber = bitmask | n;
        System.out.println("new number after bit update is "+ newNumber);
    }else{
        //clear
        int newNumber = (~bitmask) & n;
        System.out.println("new number after updation is "+newNumber);
    }
    }
}
