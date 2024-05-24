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
public class BMITest {
    
             @Test
    public void StatusTest(){
        float n= 24;
        String ex = "Standard.";
        String acc = BMI.BMIStatus(n);
        assertEquals(ex, acc);
        
    }
                 @Test
    public void StatusTest1(){
        float n= 10;
        String ex = "Under-standard.";
        String acc = BMI.BMIStatus(n);
        assertEquals(ex, acc);
        
    }             @Test
    public void StatusTest3(){
        float n= 26;
        String ex = "Overweight.";
        String acc = BMI.BMIStatus(n);
        assertEquals(ex, acc);
        
    }             @Test
    public void StatusTest4(){
        float n= 35;
        String ex = "Fat-should lose weight";
        String acc = BMI.BMIStatus(n);
        assertEquals(ex, acc);
        
    }
             @Test
    public void StatusTest5(){
        float n= 40;
        String ex = "Very fat - should lose weight immediately";
        String acc = BMI.BMIStatus(n);
        assertEquals(ex, acc);
        
    }        
    }
    
    

