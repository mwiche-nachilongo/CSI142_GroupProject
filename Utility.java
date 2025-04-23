/**Filename: Utility
 * @version 1.0
 * @author: Jesse Nyabadza, Keoleboge Onamile
 * Program to: Display creation of sort and search utility classes
 * To compile: javac Utility.java 
 */

public class Utility {
    public static void selectionSort(int[] quantity) {  //Sorts product quantities in descending order
        for (int i = 0; i <quantity.length - 1; i++) {
            int minIndex = i;

            for (int j= i + 1; j< quantity.length; j++) {
                if (quantity[j] < quantity[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = quantity[i];
            quantity[i] = quantity[minIndex];
            quantity[minIndex] = temp;
        }
    }
    
    public static int linearSearch(String[] products, String target) {
      for (int i =0; i < products.length; i++) {
        if (products[i].compareTo(target) == 1){
           System.out.println("Found");
        }
               
      }
      return -1;
    }

    public static void insertionSort(int[] price) {
        
        for (int i = 1; i < price.length; i++) {
            int key = price[i];
            int j = i-1;

            //Moves prices that are bigger than key one position ahead
            while (j >= 0 && price[j]>key) {
                price[j + 1] = price[j];
                j--;
            }
            //place key in the correct position
            price[j + 1] = key;
        }

    }
    //Recursive binary search
     public static String binarySearch (String [] products, int targetIndex, int maxIndex, String target) {
        if ( targetIndex == maxIndex ) {
        return products [maxIndex];
        }
        if (products [targetIndex].equalsIgnoreCase(target)) {
           System.out.println("The item searched for: " +products[targetIndex]);
        }  return products [targetIndex];
    }
}
