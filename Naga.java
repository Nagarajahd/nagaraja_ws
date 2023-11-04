import java.util.*;


public class Naga {
    
    public static void main(String[] args) {
        int[] arr1= {4, 9, 1, 3}; 
        int [] arr2= {2,3,3,1};

        int[] arr3 = new int[9];
        int k=0;
        for (int i=0; i<arr2.length;i++) {
            for (int j=0; j< arr2[i];j++){
                arr3[k++] = arr1[i];
            }
        }
        for (int i : arr3) {
       System.out.print(i+"\t");      
        
        }
              System.out.println();         


        //----------------------------------------------

         Map<String, Integer> maps = new TreeMap<>();
            String str = "10";
            maps.put(new String("10"), 25);
            maps.put(new String("10"), 30);

            System.out.println(maps.get(str));
            

            Product p1=new Product(21,"naga", 374);
            Product p2=new Product(21,"naga", 374);
            Set set = new HashSet<>();

            set.add(p1);
            set.add(p2);
            System.out.println(set.size());
    }  
}
