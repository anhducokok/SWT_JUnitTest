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
public class JUnitTestPhanLoaiHS {
    
    public JUnitTestPhanLoaiHS() {
    }
    
    @Test
    public void testLoaiHS9() {
        float diemso = 9;
        String actualResult;
        String expectedResult = "Học sinh xuât sắc";
        
        PhanLoaiHS phanLoaiHS = new PhanLoaiHS();
        actualResult = phanLoaiHS.loaiHS(diemso);
        assertEquals(expectedResult, actualResult); 
    }
    
    @Test
    public void testLoaiHS8() {
        float diemso = 8;
        String actualResult;
        String expectedResult = "Học sinh giỏi";
        
        PhanLoaiHS phanLoaiHS = new PhanLoaiHS();
        actualResult = phanLoaiHS.loaiHS(diemso);
        System.out.println("actualResult cua diem so  " + diemso + " = " +   actualResult );
        assertEquals(expectedResult, actualResult); 
    }
    
    @Test
    public void testLoaiHS7() {
        float diemso = 7;
        String actualResult;
        String expectedResult = "Học sinh khá";
        
        PhanLoaiHS phanLoaiHS = new PhanLoaiHS();
        actualResult = phanLoaiHS.loaiHS(diemso);
        System.out.println("actualResult cua diem so  " + diemso + " = " +   actualResult );
        assertEquals(expectedResult, actualResult); 
    }
    
      @Test
    public void testLoaiHS6() {
        float diemso = 6;
        String actualResult;
        String expectedResult = "Học sinh trung bình";
        
        PhanLoaiHS phanLoaiHS = new PhanLoaiHS();
        actualResult = phanLoaiHS.loaiHS(diemso);
        System.out.println("actualResult cua diem so  " + diemso + " = " +   actualResult );
        assertEquals(expectedResult, actualResult); 
    }
    
      @Test
    public void testLoaiHSSai() {
        float diemso = 16;
        String actualResult;
        String expectedResult = "Học sinh yếu";
        
        PhanLoaiHS phanLoaiHS = new PhanLoaiHS();
        actualResult = phanLoaiHS.loaiHS(diemso);
        System.out.println("actualResult cua diem so  " + diemso + " = " +   actualResult );
        assertEquals(expectedResult, actualResult); 
    }
    
    
}
