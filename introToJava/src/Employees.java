import java.util.*;

// class Employees {
//     public int id;
//     public String name;  
//     int salary; 

//     public int getSalary(){
//         return salary;
        
//     }

//     public void printDetails(){
//          System.out.println("My id is "+id);
//          System.out.println("My name is "+name);

//     }

//     public class CustomClass{
//         public static void main(String[] args) {
//             System.out.println("This is pure custom class");
//             Employees Vaibhav = new Employees();  // instatiating new employee object
//             Employees Makya = new Employees();  // instantiating new employee object 

//             // Setting attributes for Vaibhav 
//             Vaibhav.id = 12;
//             Vaibhav.salary = 35000;
//             Vaibhav.name = "Vaibhav Jadhavar";

//             //Setting attributes for Makya
//             Makya.id = 13;
//             Makya.salary = 25000;
//             Makya.name = "Makarand Zagade";

//             //printing the attributes
//             Vaibhav.printDetails();
//             System.out.println("My salary is "+Vaibhav.getSalary());
//             Makya.printDetails();
//             System.out.println("My salary is "+Makya.getSalary());

//         }
//     }
// }

class Employees {
     int salary;
     String name;

// setting functions to call  to get salary, name etc.
public int getSalary(){ 
    return salary;
}

public String getName(){
    return name;
}

public String setName(){
    return name;
}

public class CustomClass{   // there must be one public class present
     public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Employees Vaibhav = new Employees(); //instantiating new employee object
        Employees Bharat = new Employees(); // instantiating new employee object 
        
        //setting attributes 
        Vaibhav.name = "Vaibhav Jadhavar";
        Vaibhav.salary = 35;

        Bharat.name = "Bharat Maskar";
        Bharat.salary = 45;
       
        System.out.println("My name is "+Vaibhav.getName());
        System.out.println("My current salary is "+Vaibhav.getSalary());

        CellPhones nokia = new CellPhones(); //setting new object nokia
        nokia.ringing();
        nokia.vibrating();

        
        Square attr = new Square();  // setting new object attr
        System.out.println("enter side");
        attr.side = sc.nextInt();
        System.out.println("area of square is "+attr.area()); // function call area for attr object
        System.out.println("perimeter of square is "+attr.perimeter()); // function call perimeter for attr object
        
     }  

        
    }
}
class CellPhones{
    public void ringing(){
        System.out.println("phones are ringing");
    }

    public void vibrating(){
        System.out.println("phones are vibrating");

    }
     
}

class Square{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}
