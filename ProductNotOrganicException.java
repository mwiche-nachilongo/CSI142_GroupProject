import java.util.Scanner;

/**Filename: ProductNotOrganicException
 * @version 1.0
 * @author Mwiche Dina Nachilongo 202208650
 * Program to: Display creation of second custom exception thrown in test code
 * To compile: javac ProductNotOrganicException.java
 */


public class ProductNotOrganicException extends OrganicProduct {
  
      public ProductNotOrganicException(String name, double price , int quantity, String certificationBody) {
        super(name, price, quantity);  //Initializes variables in sub-class (OrganicProduct)


      } //create constructor

    public static void main(String[] args) {
    Scanner till = new Scanner (System.in);

        try {
            String name = till.next();
            String certificationBody = till.next();
            if ((name.equals(null) && certificationBody.equals("Not certified organic"))){//try risky code
                System.out.println("Product name not entered.");
            }
            
        } catch (Exception ProductNotOrganicException) {
          System.out.println("Enter product name: ");  // handle exception
          String name = till.next();
        }
        finally {
            System.out.println("End of Exception. Thank you!");
        }
    }
}

    
