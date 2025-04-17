/**Filename: Fruit
 * @author: Kyle Makunga 
 *@version: 1.0
 * Program to: Display the creation of subclass of superclass (Product)
 * To compile: javac Fruit.java
 */

public class Fruit extends Product {
    private boolean isSeasonal;

    //Explicitly delcare product attributes in constructor
    public Fruit(String name, double weight, boolean isSeasonal) {
        super(name, weight);  //initialize superclass fields
        this.isSeasonal = isSeasonal;
    }

    public boolean isSeasonal() {
        return isSeasonal;
    }
    
//setter
    public void setSeasonal(boolean seasonal) {
        isSeasonal = seasonal;
    }
//Method from superclass for overridding
    @Override
    public void displayInfo() {
        System.out.println("Fruit: " + getName() + ", Weight: " + getWeight() + "kg, Seasonal: " + isSeasonal);
    }
}
