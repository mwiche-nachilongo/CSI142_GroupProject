/**Filename: Meat
 * @author: Kyle Makunga 
 *@version: 1.0
 * Program to: Display the creation of subclass of Product superclass
 * To compile: javac Meat.java
 */

public class Meat extends Product {
    private String cutType;

    public Meat(String name, double weight, String cutType) {
        super(name, weight);  //Create constructor with subclass attributes
        this.cutType = cutType;
    }
    //getters and setters
    public String getCutType() {
        return cutType;
    }

    public void setCutType(String cutType) {
        this.cutType = cutType;
    }
//Override method in superclass
    @Override 
    public void displayInfo() {
        System.out.println("Meat: " + getName() + ", Weight: " + getWeight() + "kg, Cut: " + cutType);
    }
}
