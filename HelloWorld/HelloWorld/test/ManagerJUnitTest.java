/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

//import Manager.Manager;
//import Manager.Manager;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ManagerJUnitTest {
    

       @Test
    public void testcheckOdd(){
     Manager ma = new Manager();
     int n = 1;
      boolean ex = true;
     boolean n1 = ma.checkOdd(n);
           assertEquals(ex, n1);
    }
           @Test
    public void testcheckOdd2(){
     Manager ma = new Manager();
     int n = 2;
      boolean ex = false;
     boolean n1 = ma.checkOdd(n);
           assertEquals(ex, n1);
    }
    @Test
    public void testcheckEven(){
         Manager ma = new Manager();
     int n = 1;
      boolean ex = false;
     boolean n1 = ma.checkEven(n);
           assertEquals(ex, n1);
    }
       @Test
    public void testcheckEven1(){
         Manager ma = new Manager();
     int n = 2;
      boolean ex = true;
     boolean n1 = ma.checkEven(n);
           assertEquals(ex, n1);
    }
     @Test
    public void testCheckOddNegative() {
        Manager ma = new Manager();
        int n = -3;
        boolean ex = false;
        boolean n1 = ma.checkOdd(n);
        assertEquals(ex, n1);
    }
        @Test
    public void testCheckEvenNegative() {
        Manager ma = new Manager();
        int n = -4;
        boolean ex = true;
        boolean n1 = ma.checkEven(n);
        assertEquals(ex, n1);
    }
     @Test
    public void testCheckZero() {
        Manager ma = new Manager();
        int n = 0;
        boolean exOdd = false;
        boolean exEven = true;
        boolean nOdd = ma.checkOdd(n);
        boolean nEven = ma.checkEven(n);
        assertEquals(exOdd, nOdd);
        assertEquals(exEven, nEven);
    }
     @Test
    public void testCheckOddLargeNumber() {
        Manager ma = new Manager();
        int n = 999999;
        boolean ex = true;
        boolean n1 = ma.checkOdd(n);
        assertEquals(ex, n1);
    }
    @Test
    public void testCheckEvenLargeNumber() {
        Manager ma = new Manager();
        int n = 1000000;
        boolean ex = true;
        boolean n1 = ma.checkEven(n);
        assertEquals(ex, n1);
    }
}
