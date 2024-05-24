/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TrungNT
 */
public class JUnitTestBubbleSort {
    
    public JUnitTestBubbleSort() {
    }
    
    @Test
    public void testBubbleSort() {
        int[] intputArray = new int[] { 2, 6, 3, 8, 4, 9, 1 };
        int[] actualResultArr;
        
        int[] expectedOutput = new int[] { 1, 2, 3, 4, 6, 8, 9 };
        
        SortArray sa = new SortArray();
        actualResultArr = sa.bubbleSort(intputArray);
        
        assertArrayEquals(expectedOutput, actualResultArr);
        
    }
    
}
