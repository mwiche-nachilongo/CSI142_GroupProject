/**Filename: Test
 * @version:1.0
 * @author: Mwiche Dina Nachilongo 202208650
 * Program to: Test custom exception for subclasses (LimitExceededException)
 * To compile: javac Test.java
 * To execute: java Test
 */

import java.util.Scanner;

public class Test {
   public static void main (String[] args) throws LimitExceededException{
  
    Scanner till = new Scanner (System.in);

    Fruit f1 = new Fruit("apple", 800.0, false);
    Meat m1 = new Meat("beef", 400.0, "loin");      //instantiate objects from sub-classes
    Fruit f2= new Fruit("banana", 600.00, false);
    Meat m2 = new Meat("pork", 700.00, "belly");

    System.out.println("***Catalogue of items in stock***");

    f1.displayInfo();
    f2.displayInfo();  //Print out objects instantiated
    m1.displayInfo();
    m2.displayInfo();


   System.out.println("Select desired weight of fruit or meat in catalogue to validate: "); //Prompt user input
   double weight = till.nextDouble();
   weightValidation(weight);
 
   till.close();
   }
//Create method to validate whether the parameter (weight) meets limit criterion
   private static void weightValidation( double weight) throws LimitExceededException {  
      if (weight < 10)  {
      throw new LimitExceededException("Select a weight below 10kg please!");
      }
   }
}
}


