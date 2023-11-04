import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void modifyValue(int x) {
        x = x + 10; // Modifying the parameter
    }
    public static void main(String[] args) {

         int value1 = 5;
        modifyValue(value1); // Pass by value
        System.out.println("----------->>"+value1); // Output: 5 (original value is not changed)


        Integer[] sumOfIntegers ={1,2,3,4,5};

        List<Integer> arl= Arrays.asList(sumOfIntegers);
        //arl.forEach(System.out::println);
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        int sumOfInt = arl.stream().sorted(Comparator.reverseOrder()).reduce(0,(a,b)->a+b);
       
        Optional<Integer> op = arl.stream().filter(a-> a.equals(2)).findFirst();
          System.out.println(op.get());
        System.out.println(sumOfInt);

Map<Integer, Integer> integerMap = integerList.stream()
                .collect(Collectors.toMap(
                    // Key: identity function (no change)
                    key -> key,
                    // Value: identity function (no change)
                    value -> value
                ));

        // Printing the resulting map
        System.out.println("List to Map: " + integerMap);



        ArrayList<String> al=new ArrayList<>();

        al.add("Santhosh");
        al.add("Venkat");
         ArrayList<String> al2=new ArrayList<>();
        al2.add("Arun");
        al2.add("venKat");

        List<String> ls = new ArrayList<>();

       for(String s : al){
        if(al2.contains(al)){
            ls.add(s);
        }
       }
       al.remove(ls);
       al2.remove(ls);
       
       System.out.println("List1 after removing ele"+al);
       System.out.println("List2 after removing ele"+al2);
       

    
    
   
       
    }
}
