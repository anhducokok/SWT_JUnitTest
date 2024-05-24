/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author vip2021
 */
public class J1Sp0009Test {
    


    @Test
    public void testFindFiboSequenceLength() {
        int n = 10;
        int[] fiboArray = J1Sp0009.findFiboSequence(n);
        assertEquals(n, fiboArray.length);
    }

    @Test
    public void testFirstFibonacciNumbers() {
        int[] fiboArray = J1Sp0009.findFiboSequence(2);
        assertEquals(0, fiboArray[0]);
        assertEquals(1, fiboArray[1]);
    }

    @Test
    public void testFiboSequenceUpToTen() {
        int[] fiboArray = J1Sp0009.findFiboSequence(10);
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, fiboArray);
    }

    @Test
    public void testFiboSequenceUpToFortyFive() {
        int[] fiboArray = J1Sp0009.findFiboSequence(45);
        assertEquals(267914296, fiboArray[44] - fiboArray[43]);
    }

    @Test
    public void testZeroLength() {
        int[] fiboArray = J1Sp0009.findFiboSequence(0);
        assertEquals(0, fiboArray.length);
    }

    @Test
    public void testFiboSequenceBoundary() {
        int[] fiboArray = J1Sp0009.findFiboSequence(2);
        assertEquals(0, fiboArray[0]);
        assertEquals(1, fiboArray[1]);
    }

    @Test
    public void testDisplayFiboSequence() {
        int[] fiboArray = {0, 1, 1, 2, 3, 5, 8};
        J1Sp0009.displayFiboSequence(fiboArray);
        // Check console output manually for correctness
    }

    @Test
    public void testFindFiboSequenceLargeNumber() {
        int n = 40;
        int[] fiboArray = J1Sp0009.findFiboSequence(n);
        assertEquals(63245986, fiboArray[39]);
    }

    @Test
    public void testFindFiboSequenceSingleElement() {
        int[] fiboArray = J1Sp0009.findFiboSequence(1);
        assertEquals(1, fiboArray.length);
        assertEquals(0, fiboArray[0]);
    }
}

  
