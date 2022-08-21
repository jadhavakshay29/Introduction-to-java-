import java.util.*;

class MyEmployee{
    private int id;
    private String name;


public void setId(int i){
    id = i;
}

public int getId(){
    return id;
}

public void setName(String n){
    this.name = n; // we can use this.name or only name both are valid
}

public String getName(){
    return name;
}
}
public class AccessModifier {
    public static void main(String[] args) {
        MyEmployee vaibhav =  new MyEmployee();  //instatiating an object naming vaibhav
        vaibhav.setName("Vaibhav Jadhavar"); // we  call function setname  and set the names to be displayed 
        vaibhav.setId(34); // same as above
        System.out.println("My id is "+ vaibhav.getId());
        System.out.println("my name is "+vaibhav.getName());
       
    }
}
