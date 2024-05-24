
public class J1Sp0009 {

    public static void main(String[] args) {

        // Step 1: Find 45 sequence of Fibonacci
        int[] fiboArray = findFiboSequence(45);

        // Display 45 sequence of Fibonacci
        displayFiboSequence(fiboArray);
    }

    /*
     * Find Fibonacci sequence iteratively
     * @param n: the number of Fibonacci numbers to find
     * @return an array of Fibonacci numbers
     */
    public static int[] findFiboSequence(int n) {
        int[] fiboArray = new int[n];
        if (n <= 0) {
            return new int[n]; // Return an empty array for non-positive input
        } else {
            if (n > 0) {
                fiboArray[0] = 0;
            }
            if (n > 1) {
                fiboArray[1] = 1;
            }

            for (int i = 2; i < n; i++) {
                fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
            }
        }

        return fiboArray;
    }

    /*
     * Display Fibonacci sequence
     * @param fiboArray: an array of Fibonacci numbers
     */
    public static void displayFiboSequence(int[] fiboArray) {
        int arraySize = fiboArray.length;
        System.out.println("The " + arraySize + " sequence fibonacci:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(fiboArray[i]);
            // Check to print comma
            if (i < arraySize - 1) {
                System.out.print(", ");
            }
        }
    }
}
