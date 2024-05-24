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
        int[] intputArray = new int[] { 2, 6, 3,  4, 9, 1 ,7};
        int[] actualResultArr;
        
        int[] expectedOutput = new int[] { 1, 2, 3, 4, 6, 7, 9 };
        
        SortArray sa = new SortArray();
        actualResultArr = sa.bubbleSort(intputArray);
        
        assertArrayEquals(expectedOutput, actualResultArr);       
    }
    @Test
    public void testBubleSort2(){
               int[] intputArray = new int[] { 2, 5, 3,  4, 9, 1 ,7,123,231,132,111};
        int[] actualResultArr;
        
        int[] expectedOutput = new int[] { 1, 2, 3, 4, 5, 7, 9 ,111,123,132,231};
        
        SortArray sa = new SortArray();
        actualResultArr = sa.bubbleSort(intputArray);
        
        assertArrayEquals(expectedOutput, actualResultArr);
        
    }
    
}
