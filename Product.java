/**Filename: Product
 * @author: Kyle Makunga 
 *@version: 1.0
 * Program to: Display the creation of abstract supeclass for inheritance
 * To compile: javac Product.java
 */
public abstract class Product {
    private String name;
    private double weight; // in kg

    //Explicitly declared Product constructor with product attributes
    public Product(String name, double weight) {
        this.name = name;
        this.weight = weight;  
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void displayInfo(); //method to be overriddedn in subclasses
}

