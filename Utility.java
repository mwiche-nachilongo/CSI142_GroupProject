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

    public static String linearSearch(String[] products, String target) {
      for (int i =0; i < products.length; i++) {
        if (products[i].compareTo(target) == 1){
           return i;
           System.out.println("Found");
        }
               
      }
      return -1;
    }

    public static insertionSort(int[] price) {
        
        for (int i = 1; i < price.length; i++;) {
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
}
