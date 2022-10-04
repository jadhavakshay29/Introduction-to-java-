import NewtonBasics;
import java.util.*;

public class HashSet {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //creating hashset
        HashSet<Integer> set = new HashSet<>();

        //insert numbers in set
        set.add(1);
        set.add(5);
        set.add(6);
        set.add(9);

        //searching for number in set
        if(set.contains(5)){
            System.out.println("5 is present in set");
        }

        //removing number from set
        set.remove(1);

        //to find size of a set
        System.out.println("Size of set is "+set.size());

        // printing set
        System.out.println("set is "+set);

        //instantiating iterator to traverse set
        Iterator it = set.iterator();
        
        //priting array or trversing and printing 
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

     }
}
