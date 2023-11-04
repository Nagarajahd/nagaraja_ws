import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TestJava {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String fileName="price_data_txt";

        Map<String,PriceData> priceDataMap = new HashMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            
            String line;

            while((line = reader.readLine())!= null){
                //we need method for getting 8 character numeric 
                if(line.matches("")){

                }else{
                    
                }
                String [] parts =line.split("");
                if(parts.length==4){
                    String cusip=parts[0];
                    double closingPrice =Double.parseDouble(parts[1]);
                    double minPrice =Double.parseDouble(parts[2]);
                    double maxPrice =Double.parseDouble(parts[3]);

                    PriceData pricedata = priceDataMap.get(cusip);
                    if(pricedata==null){
                        pricedata=new PriceData();
                        priceDataMap.put(cusip,pricedata);
                    }
                    pricedata.updatePrices(closingPrice,minPrice,maxPrice);
                }
            }

            for (Map.Entry<String,PriceData>entry:priceDataMap.entrySet()) {
                String cusip= entry.getKey();
                PriceData pricedata= entry.getValue();
                System.out.println("CUSIP :"+ cusip);
                 System.out.println("Closing price :"+ pricedata.getClosingPrice());
                  System.out.println("Minimum price :"+ pricedata.getMinimumPrice());
                   System.out.println("Maximum price  :"+ pricedata.getMaximumPrice());
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
 }
}

