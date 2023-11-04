public class PriceData {
    private double closingPrice;
    private double minPrice;
    private double maxPrice;

    public PriceData(){
        closingPrice=Double.NaN;
        minPrice=Double.POSITIVE_INFINITY;
        maxPrice=Double.NEGATIVE_INFINITY;
    }

public void updatePrices(double closingPrice,double minPrice,double maxPrice){
    this.closingPrice=closingPrice;
    this.minPrice=minPrice;
    this.maxPrice=maxPrice;
}

public double getClosingPrice(){
    return closingPrice;
}
public double getMinimumPrice(){
    return minPrice;
}

public double getMaximumPrice(){
    return maxPrice;
}

}
