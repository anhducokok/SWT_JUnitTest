/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Scanner;

/**
 *
 * @author vip2021
 */
public class GetInput {
    private static final Scanner sc = new Scanner(System.in);
    
    // create 3 method: nhap String, nhap Int, nhap double
    //msg: notify before input
    public String inputString(String msg){
        System.out.println(msg);
        while(true){
            String result = sc.nextLine();
            if(result.length() == 0 || result ==null){
                System.out.println("Not allowed input a empty string! Please input again");
                continue;
            }
            return result;
        }
    }
    public int inputInt(String msg,int min, int max){
        System.out.println(msg);
        while(true){
            String result = sc.nextLine().trim();
            try{
                int res = Integer.parseInt(result);
                if(res< min || res >max){
                    System.out.println("Must be from "+min+ " to "+max+"! Please input again.");
                    continue;
                }
                return res; 
            }catch(NumberFormatException e){
                System.out.println("Please input a right format number! Input again");
                
            }
           
        }
    }
    public float inputFloat(String msg){
        System.out.println(msg);
        while(true){
            String result = sc.nextLine().trim();
            try{
                float res = Float.parseFloat(result);
                
                return res; 
            }catch(NumberFormatException e){
                System.out.println("Please input a right format number! Input again");
                
            }
           
        }
    }
    public boolean checkOdd(float x){
       if(x%2!=0){
           return true;
       }
       else return false;
    }
    public boolean checkPerfectSquare(float x){
        if((int) Math.sqrt(x)*(int) Math.sqrt(x)==x){
            return true;
        }
        else{
            return false;
        }
    }
}
