import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AlTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Santhosh");
        al.add("Venkat");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Arun");
        al2.add("venKat");

        // Create a TreeSet with a custom comparator for case-sensitive comparison
        Set<String> uniqueElements = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        // Add elements from the first ArrayList
        uniqueElements.addAll(al);

        // Add elements from the second ArrayList
        uniqueElements.addAll(al2);

        // Convert the Set back to an ArrayList if necessary
        List<String> resultList = new ArrayList<>(uniqueElements);

        // Print the result
        System.out.println("Unique Elements (case-sensitive): " + resultList);
    }
}

