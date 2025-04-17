/**Filename: Price
 * @author: Kyle Makunga 
 *@version: 1.0
 * Program to: Display the creation of class for inheritance
 * To compile: javac Price.java
 *To execute: java Price
 */

public class Price {
    private double pricePerKg;

    public Price(double pricePerKg) {
        this.pricePerKg = pricePerKg; //constructor to inilitailize product attribute (price)
    }

    //getters and setters
    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }
//method to calculate price
    public double calculateTotal(double weight) {
        return pricePerKg * weight;
    }
}
