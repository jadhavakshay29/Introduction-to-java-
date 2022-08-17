import java.util.*;

public class Add {
  public static int Sum(int a, int b){
      int addition = a + b;
      System.out.println("Addition is:  "+ addition);
//      System.out.println(addition);
      return addition;
  }
  public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

      Sum(a,b);
  }
}
