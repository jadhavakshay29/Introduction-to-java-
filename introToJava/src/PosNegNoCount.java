import java.util.*;

public class PosNegNoCount {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int zero = 0;
        String choice;
do{   
        int number[] =  new int[5];
      System.out.println("print numbers");
      for (int i = 0; i< 5; i++){
        number[i] = sc.nextInt();
      }

     for(int i =0; i< 5; i++){
        if(number[i]>=1){
            pos++;
        }else if(number[i]==0){
            zero++;
        }else if(number[i]<=0){
            neg++;
        }
     } 
        
     System.out.println("positive numbers are: " + pos);
     System.out.println("negative numbers are: " + neg);
     System.out.println("zeros are: "+ zero);

    System.out.println("wanat to continue? ");
    choice = sc.next();
    }while(choice.equals("y")); // use equals method than normal == ,for comparison for string
    // reltional operator compare memory location in case of string 
    // and equal methods compare data in that memory, therefore more realiable
       
      
}
}
