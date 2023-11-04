
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Hello {

    public static void main(String[] args) {
        List<Product> ls= new ArrayList<>();
        ls.add(new Product(1,"DELL" ,40000f));
         ls.add(new Product(2,"MAC" ,80000f));
          ls.add(new Product(3,"LEN" ,60000f));
           ls.add(new Product(4,"ACER" ,50000f));
           ls.add(new Product(5,"THINK" ,80000f));
           //ls.forEach(name->System.out.println(name.getName()));
        List<Float> prFloats=ls.stream()
        .filter(p->p.getPrice()<=80000)
        .map(p->p.getPrice())
        .collect(Collectors.toList());

        System.out.println(prFloats);


        List<String> lStrings=ls.stream().filter(a->a.getPrice() >= 50000)
                                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                                .map(a-> a.getName()).collect(Collectors.toList());
        List<String> lStringf=ls.stream().filter(a->a.getPrice() < 50000)
                                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                                .map(a-> a.getName()).collect(Collectors.toList());
                                 System.out.println("***********************");
 System.out.println(lStrings);
  System.out.println(lStringf);
  System.out.println("***********************");
         Map<Integer,String> prMap=ls.stream()
        .filter(p->p.getPrice()<=80000)
        .collect(Collectors.toMap(Product::getId, Product::getName));
        prMap.forEach((key, value) -> {
            System.out.print(key + "=" + value + " ");
          });
        
        List<String> prName=ls.stream()
        .filter(p->p.getPrice()<=80000)
        .map(a-> a.getName()).sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        
       System.out.println(prName);
 System.out.println("==========================================");
       boolean any=ls.stream().anyMatch(p->p.getPrice()==80000);
       System.out.println(any);

       Optional<String> op = Optional.ofNullable(ls.get(0).getName());
       System.out.println(op.get());
       if(op.isPresent()){
        System.out.println("i am Present"+op.get());
       }else{
        System.out.println("not present");
       }

        Product ops =ls.stream().filter(p->p.getPrice()>=80000).findFirst().orElse(new Product(0, null, 0));
                System.out.println(ops.getName());

        ls.stream().filter(a-> a.getName().startsWith("D")).filter(a-> a.getPrice() > 20000).map(a-> a.getName().toLowerCase()).forEach(System.out::println);;
    }


    
}