/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
//import BbSortArray. BbSortArray;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class BbSortArrayTest {
    
    
    @Test
    public void testArray(){
        int[] n = new int[]{6,1,2,4,3};
        int[] a = new int[]{1,2,3,4,6};
//        BbSortArray b = new BbSortArray();
         int[] n1 = BbSortArray.sortArrayAscending(n);
        assertArrayEquals(a, n1);
    }
       @Test
    public void testArray1(){
        int[] n = new int[]{6,1,2,4,3};
        int[] a = new int[]{6,4,3,2,1};
//        BbSortArray b = new BbSortArray();
         int[] n1 = BbSortArray.sortArrayDescending(n);
        assertArrayEquals(a, n1);
    }
      @Test
    public void testEmptyArray() {
        int[] n = new int[]{};
        int[] a = new int[]{};
        int[] n1 = BbSortArray.sortArrayAscending(n);
        assertArrayEquals(a, n1);
    }
       @Test
    public void testSingleElementArray() {
        int[] n = new int[]{5};
        int[] a = new int[]{5};
        int[] n1 = BbSortArray.sortArrayAscending(n);
        assertArrayEquals(a, n1);
    }
    @Test
    public void testAllEqualElements() {
        int[] n = new int[]{3, 3, 3, 3, 3};
        int[] a = new int[]{3, 3, 3, 3, 3};
        int[] n1 = BbSortArray.sortArrayAscending(n);
        assertArrayEquals(a, n1);
    }
  @Test
    public void testArrayWithNegativeNumbers() {
        int[] n = new int[]{-3, -1, -4, -2, -5};
        int[] a = new int[]{-5, -4, -3, -2, -1};
        int[] n1 = BbSortArray.sortArrayAscending(n);
        assertArrayEquals(a, n1);
    }
       @Test
    public void testSortedArrayAscending() {
        int[] n = new int[]{1, 2, 3, 4, 6};
        int[] a = new int[]{1, 2, 3, 4, 6};
        int[] n1 = BbSortArray.sortArrayAscending(n);
        assertArrayEquals(a, n1);
    }
       @Test
    public void testSortedArrayDescending() {
        int[] n = new int[]{6, 4, 3, 2, 1};
        int[] a = new int[]{6, 4, 3, 2, 1};
        int[] n1 = BbSortArray.sortArrayDescending(n);
        assertArrayEquals(a, n1);
    }
}
