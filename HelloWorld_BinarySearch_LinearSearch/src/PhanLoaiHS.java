/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TrungNT
 */
public class PhanLoaiHS {
    
    public  String loaiHS(float diemso) {
        
        if( (diemso >=9) && (diemso <= 10) ) {
            return "Học sinh xuât sắc";
        } else if( (diemso >= 8) && (diemso <9 ) ) {
            return "Học sinh giỏi";
        } else if( (diemso >= 6.5) && (diemso < 8) ) {
            return "Học sinh khá";
        } else if( (diemso >=5) && (diemso < 6.5) ) {
            return "Học sinh trung bình";
        } else {
             return "Học sinh yếu";
        }
       
    }
    
//    public static void main(String[] args) {
////        float diemso = 9;
////        
////        System.out.println(" điểm  " + diemso + "  " + loaiHS(diemso));
////        diemso = 8;
////       System.out.println(" điểm  " + diemso + "  " + loaiHS(diemso));
////       diemso = 7;
////      System.out.println(" điểm  " + diemso + "  " + loaiHS(diemso));
////        diemso = 6;
////       System.out.println(" điểm  " + diemso + "  " + loaiHS(diemso));
////        diemso = 4;
////        System.out.println(" điểm  " + diemso + "  " + loaiHS(diemso));
//    }
}
