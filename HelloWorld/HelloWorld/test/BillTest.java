/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class BillTest {
    
    public BillTest() {
    }
    @Test
    public void TestCal(){
//        Bill b = new Bill();
        int[] n = new int[]{1,2,3,4,5,6} ;
        int ex = 21;
        int acc = Bill.calcTotal(n);
        assertEquals(ex, acc);
        
    }
      @Test
    public void TestCalEmpty(){
//        Bill b = new Bill();
        int[] n = new int[]{} ;
        int ex = 0;
        int acc = Bill.calcTotal(n);
        assertEquals(ex, acc);
        
    }
        @Test
    public void TestPayMoney(){
//        Bill b = new Bill();
//        int[] n = new int[]{} ;
        int a = 1;
        int b = 2;
        boolean ex = true;
        boolean acc = Bill.payMoney(a, b);
        assertEquals(ex, acc);
        
    }
          @Test
    public void TestPayMoney2(){
//        Bill b = new Bill();
//        int[] n = new int[]{} ;
        int a = 3;
        int b = 2;
        boolean ex = false;
        boolean acc = Bill.payMoney(a, b);
        assertEquals(ex, acc);
        
    }
             @Test
    public void TestPayMoney3(){
//        Bill b = new Bill();
//        int[] n = new int[]{} ;
        int a = 3;
        int b = 3;
        boolean ex = true;
        boolean acc = Bill.payMoney(a, b);
        assertEquals(ex, acc);
        
    }
             @Test
    public void TestPrintTotal(){
                int[] n = new int[]{1,2,3,4,5,6} ;
        int b = 2;
        String ex = "You can't buy it.";
        String acc = Bill.printTotalAndResult(n, b);
        assertEquals(ex, acc);
        
    }
               @Test
    public void TestPrintTotal2(){
                int[] n = new int[]{1,2,3,4,5,6} ;
        int b = 100;
        String ex = "You can buy it";
        String acc = Bill.printTotalAndResult(n, b);
        assertEquals(ex, acc);
        
    }
     @Test
    public void TestCalWithNegativeNumbers() {
        int[] n = new int[]{-1, -2, -3, -4, -5, -6};
        int ex = -21;
        int acc = Bill.calcTotal(n);
        assertEquals(ex, acc);
    }
    @Test
    public void TestCalSingleElement() {
        int[] n = new int[]{42};
        int ex = 42;
        int acc = Bill.calcTotal(n);
        assertEquals(ex, acc);
    }
       @Test
    public void TestPayMoneyExact() {
        int a = 21;
        int b = 21;
        boolean ex = true;
        boolean acc = Bill.payMoney(a, b);
        assertEquals(ex, acc);
    }
    @Test
    public void TestPayMoneyInsufficient() {
        int a = 20;
        int b = 21;
        boolean ex = true;
        boolean acc = Bill.payMoney(a, b);
        assertEquals(ex, acc);
    }
     @Test
    public void TestPrintTotalInsufficient() {
        int[] n = new int[]{10, 20, 30};
        int b = 50;
        String ex = "You can't buy it.";
        String acc = Bill.printTotalAndResult(n, b);
        assertEquals(ex, acc);
    }
}
