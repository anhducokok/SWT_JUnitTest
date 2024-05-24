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
public class StudentTest {
    
    public StudentTest() {
    }
    
             @Test
    public void StudentTest(){
        Student s = new Student();
        int n = 2;
        int ex = 2;
        String sb = "Math";
        int acc = s.checkInputMark(sb, n);
                 assertEquals(ex, acc);
        
    }
               @Test
    public void StudentTest2(){
        Student s = new Student();
        int n = 0;
        int ex = 0;
        String sb = "Math";
        int acc = s.checkInputMark(sb, n);
                 assertEquals(ex, acc);
        
    }
}
