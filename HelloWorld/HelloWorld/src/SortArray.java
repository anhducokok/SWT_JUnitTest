/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TrungNT
 */
public  class SortArray extends Object  { //IS-A
    
    
  public  int[] bubbleSort(int[] intArray) {
    int out, in;
    for (out = intArray.length - 1; out > 0; out--) {
      for (in = 0; in < out; in++) {
        if (intArray[in] > intArray[in + 1]) {
          swap(intArray, in, in + 1);
        }
      }
    }
    return intArray;
  }

  private  void swap(int[] intArray, int one, int two) {
    int temp = intArray[one];
    intArray[one] = intArray[two];
    intArray[two] = temp;
  }
    
}
