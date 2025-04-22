/**Filename: Test2
 * @version:1.0
 * @author: Mwiche Dina Nachilongo 202208650
 * Program to: Test custom exception for subclasses (ProductNotInStockException)
 * To compile: javac Test2.java
 * To execute: java Test
 */

 import java.util.Scanner;

 public class Test2 {
    public static void main (String[] args) throws ProductNotInStockException{
   
     Scanner till = new Scanner (System.in);

 //instantiate objects in both subclasses

     Fruit f1 = new Fruit("apple", 800.0, false);
     Meat m1 = new Meat("beef", 400.0, "loin");
     Fruit f2= new Fruit("banana", 600.00, false);
     Meat m2 = new Meat("pork", 700.00, "belly");
     Fruit l1 = new Fruit("Lemons", 0.00, true);
     Fruit l2 = new Fruit ("Avocados", 0.00, true);
     Fruit l3 = new Fruit("Oranges", 0.00, true);
 
     System.out.println("***Catalogue of items in stock***");
 
     f1.displayInfo();
     f2.displayInfo();
     m1.displayInfo();
     m2.displayInfo();  //display objects instantiated
     l1.displayInfo();
     l2.displayInfo();
     l3.displayInfo();
 
 
    System.out.println("Select name of fruit in catalogue to validate availability: "); //prompt user input
    String name = till.next();
    stockValidation(name);

  
    till.close();
    }

    //create validation method for seasonal fruits
 
    private static void stockValidation(String name) throws ProductNotInStockException {
       if (name.equalsIgnoreCase("Avocados") && name.equalsIgnoreCase("Lemons") && name.equalsIgnoreCase("Oranges")) {
       throw new ProductNotInStockException("Product not in stock, apologies.");
       }
    }
 }
 
 
 
