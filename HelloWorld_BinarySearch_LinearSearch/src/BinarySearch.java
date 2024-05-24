import java.util.Random;

public class BinarySearch {


  public  int[] GenerateArray(int numberArray) {
    Random random = new Random();
    int[] array = new int[numberArray];
    for (int i = 0; i < numberArray; i++) {
      array[i] = random.nextInt(numberArray); // Generate numbers within array size range
    }
    return array;
  }

  public void DisplayArray(int[] array) {
    System.out.print("The array: ");
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println("");
  }

  public  void DisplayIndex(int index, int searchValue) {
    if (index == -1) {
      System.out.println("Value " + searchValue + " not found in the array.");
    } else {
      System.out.println("The value " + searchValue + " is found at index " + index);
    }
  }

  public static int BinarySearch(int[] array, int searchValue) {
    int l = 0;
    int r = array.length - 1;
    int mid;
    while (l <= r) { // Changed from l < r to l <= r to handle the case where the search value is the last element
      mid = (l + r) / 2;
      if (array[mid] == searchValue) {
        return mid;
      } else if (array[mid] > searchValue) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    return -1;
  }
}
