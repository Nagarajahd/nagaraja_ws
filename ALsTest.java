import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ALsTest {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("santhosh");
        als.add("naga");
        als.add("shivu");
        als.add("ani");
        als.add("bali");
        als.add("king");
         System.out.println("---------1---------");
        als.stream().sorted().forEach(System.out::println);
         System.out.println("---------2---------");
         als.stream().forEach(System.out::println);
         System.out.println("--------3----------");
        Collections.sort(als);
        als.stream().forEach(System.out::println);
    }
}
