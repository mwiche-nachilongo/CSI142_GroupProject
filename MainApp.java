/**Filename: MainApp
 * @version: 1.0
 * @author: Mwiche Dina Nachilongo 202208650
 * Program to: Allow employees to keep track objects in costructor chain through usage of utility classes/ validates items selected by customer
 * To compile: javac MainApp.java
 * To execute: java MainApp employee / java MainApp customer
 */
import java.util.Scanner;
import java.util.Arrays;

public class MainApp {
    public static void main (String [] args) throws Exception{

        Scanner till = new Scanner (System.in);
        if (args[0].equalsIgnoreCase("employee")){

            //arraylists
          int[] quantity = {10+ 89, 0, 23, 56, 12, 7, 90, 11};
          String [] products = {"apple","beef","banana","pork","Lemons","Avocados", "Oranges"};
          int [] price = {12, 70,18, 45, 20, 8, 35};

          //To display implementation of utility classes 
          System.out.println("Original quantity arrraylist: " +Arrays.toString(quantity));
          Utility.selectionSort(quantity);

          System.out.println("Quantity arraylist after sorting: " +Arrays.toString(quantity));


          System.out.println("Original product arraylist: " +Arrays.toString(products));
          Utility.linearSearch(products, "Lemons");

          System.out.println("Product arraylist after linear search: " +Arrays.toString(products));

          System.out.println("Product arraylist after binary search: " +Arrays.toString(products));
          Utility.binarySearch(products, 2, 7, "banana");

          System.out.println("Original price arraylist: " +Arrays.toString(price));
          Utility.insertionSort(price);

        System.out.println("Price arraylist after insertion sort: " +Arrays.toString(price) );


        }
    if (args[0].equalsIgnoreCase("customer")){
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

     System.out.println("Select desired weight of fruit or meat in catalogue to validate: "); //Prompt user input
   double weight = till.nextDouble();
   weightValidation(weight);
 

  
till.close();

    }
    }
    
    //Create method that validates seasonal stock
    private static void stockValidation(String name) throws ProductNotInStockException {
       if (name.equalsIgnoreCase("Avocados") || name.equalsIgnoreCase("Lemons") || name.equalsIgnoreCase("Oranges")) {
        throw new ProductNotInStockException("Product not in stock, apologies.");
        } 
     
    }

    

    //Create method to validate whether the parameter (weight) meets limit criterion
   private static void weightValidation( double weight) throws LimitExceededException {  
      if (weight > 10)  { 
        throw new LimitExceededException("Select a weight below 10kg please!");
      } 
      
   }
}



    

