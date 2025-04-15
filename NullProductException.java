/**Filename:NullProductException
 * @version 1.0
 * @author Mwiche Dina Nachilongo 202208650
 * Program to: Display creation of custom exception thrown in test code
 *To compile: javac NullProductException.java
 *To 
*/


import java.util.Scanner;

public class NullProductException extends RunTimeException {
     
    //create constructor
       public NullProductException (){
        super(name, weight); //Initialize variables from superclass  (product)
    }

    public static void main (String []args){
        Scanner till = new Scanner(System.in);

try {
//risky-code
String name = till.next();
if (name.equals(null)) {
    System.out.println("Product not entered.");
}
    
} catch  (Exception NullProductException) {
  System.out.println("Enter a product");  // handle exception
} 
finally {
    System.out.println("End of Exception.Thank you!"); //optional finally block
}
    }
}
