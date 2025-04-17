/**Filename: ProductNotInStockException
 * @version 1.0
 * @author Mwiche Dina Nachilongo 202208650
 * Program to: Display creation of custom exception thrown in test code
 *To compile: javac ProductNotInStockException.java
*/
public class ProductNotInStockException extends Exception{
    public ProductNotInStockException (String message){
        super (message); //create constructor with customizabe exception message
    }
}
