import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Product> ls = new ArrayList<>();
        
        ls.stream().filter(a -> a.getSalary() > 50000).map(a)
    }
}
