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
public class PhanLoaiHSTest {
    
    public PhanLoaiHSTest() {
    }

    /**
     * Test of loaiHS method, of class PhanLoaiHS.
     */
    @Test
    public void testLoaiHS() {
        System.out.println("loaiHS");
        float diemso = 0.0F;
        PhanLoaiHS instance = new PhanLoaiHS();
        String expResult = "";
        String result = instance.loaiHS(diemso);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PhanLoaiHS.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PhanLoaiHS.main(args);
        fail("The test case is a prototype.");
    }
    
}
