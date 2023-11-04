import java.util.Set;
import java.util.TreeSet;

public class EmpMain {
    public static void main(String[] args) {
         
Employee emp =new Employee(201, "John");

Employee emp1 =new Employee(201, "John");
 
 
// create a set and add those two objects


Set set = new TreeSet<>();

set.add(emp);
set.add(emp1);

System.out.println(set.size()); 
    }
}
