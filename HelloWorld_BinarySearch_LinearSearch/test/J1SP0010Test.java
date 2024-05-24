/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import j1sp0010.J1SP0010;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vip2021
 */
public class J1SP0010Test {
    
   
 
    @Test
    public void testGenerateRandomArray() {
        int size = 5;
        int[] array = J1SP0010.GenerateRadomArray(size);
        assertEquals(size, array.length);
    }

    

    @Test
    public void testLinearSearchFound() {
        int[] array = {1, 2, 3, 4, 5};
        int index = J1SP0010.LinearSearch(array, 3);
        assertEquals(2, index);
    }

    @Test
    public void testLinearSearchNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int index = J1SP0010.LinearSearch(array, 6);
        assertEquals(-1, index);
    }

   @Test
public void testGenerateRandomArrayLarge() {
  int size = 100;
  int[] array = J1SP0010.GenerateRadomArray(size);
  assertEquals(size, array.length);
}
@Test
public void testLinearSearchFirstElement() {
  int[] array = {5, 2, 3, 4, 1};
  int index = J1SP0010.LinearSearch(array, 5);
  assertEquals(0, index);
}
@Test
public void testLinearSearchEmptyArray() {
  int[] array = new int[0];
  int index = J1SP0010.LinearSearch(array, 5);
  assertEquals(-1, index);
}
@Test
    public void testLinearSearchLastElement() {
        int[] array = {1, 2, 3, 4, 5};
        int index = J1SP0010.LinearSearch(array, 5);
        assertEquals(4, index);
    }

    @Test
    public void testLinearSearchMiddleElement() {
        int[] array = {10, 20, 30, 40, 50};
        int index = J1SP0010.LinearSearch(array, 30);
        assertEquals(2, index);
    }


    @Test
    public void testGenerateRandomArrayWithZeroSize() {
        int size = 0;
        int[] array = J1SP0010.GenerateRadomArray(size);
        assertEquals(0, array.length);
    }

    @Test
    public void testLinearSearchNegativeNumber() {
        int[] array = {-5, -3, -1, 0, 2, 4, 6};
        int index = J1SP0010.LinearSearch(array, -1);
        assertEquals(2, index);
    }
     @Test
    public void testLinearSearchDuplicateElements() {
        int[] array = {1, 2, 2, 2, 3};
        int index = J1SP0010.LinearSearch(array, 2);
        // The index could be 1, 2, or 3 depending on the implementation
        assertTrue(index >= 1 && index <= 3);
    }

   

    @Test
    public void testLinearSearchOnSingleElementArray() {
        int[] array = {42};
        int index = J1SP0010.LinearSearch(array, 42);
        assertEquals(0, index);
    }


   

    
}
