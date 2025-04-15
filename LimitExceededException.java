import java.util.Scanner;

/**Filename: ProductNotOrganicException
 * @version 1.0
 * @author Mwiche Dina Nachilongo 202208650
 * Program to: Display creation of second custom exception thrown in test code
 * To compile: javac ProductNotOrganicException.java
 */


public class LimitExceededException extends RunTimeException {
  
      public LimitExceededException() {
        super(name, weight);  //Initializes variables in superclass (Product)
      } //create constructor

    public static void main(String[] args) {
    Scanner till = new Scanner (System.in);

        try {
            double weight = till.nextDouble();
            
            if (weight > 5.0){//try risky code
                System.out.println("Maximum weight (in kgs) exceeded");
            }
            
        } catch (Exception LimitExceededProduct) {
          System.out.println("Enter a weight that is equal to or below 10kg:");  // handle exception
          double weight = till.nextDouble();
        }
        finally {
            System.out.println("End of Exception. Thank you!"); //optional finally block
        }
    }
}

    
