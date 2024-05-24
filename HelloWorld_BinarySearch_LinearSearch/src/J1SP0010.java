/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0010;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vip2021
 */
public class J1SP0010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. Enter a positive decimal number
        int size = inputNumber("Enter number of array: ");
        //2. Enter a search value
        int search = inputNumber("Enter search value: ");
        //3. Generate a random integer in number range
        int[] arr = GenerateRadomArray(size);
        //4. Display the array
        DisplayArray("The array:", arr);
        //5. Search for numbers in the array by Linear Search algorithm
        int index = LinearSearch(arr,search);
        //6. Display the index of search number in array
        DisplayIndex("Found " + search + " at index: ",index);
    }

    public static int inputNumber(String msg) {
        Scanner sc = new Scanner(System.in);
        double size_array;
        String input;
        do {
            System.out.println(msg);
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input could not be empty. Please enter a positive integer number");
                continue;
            }
            try {
                size_array = Double.parseDouble(input);
                //check value of size must be a positive number
                if (size_array <= 0) {
                    throw new Exception();
                }
                //Compare float value of input with size_array catch input be a rational number
                if ((int) size_array != size_array) {
                    throw new Error();
                } else {
                    break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Input could not be a string. Please enter a positive integer number");
                continue;
            } catch (Exception NegaError) {
                System.out.println("Input could not be less than zero. Please enter a positive integer number");
                continue;
            } catch (Error RealNumError) {
                System.out.println("Input could not be a real number. Please enter a positive integer number");
                continue;
            }
        } while (true);
        return (int) size_array;
    }
    public static int[] GenerateRadomArray(int sizeOfArray) {
         int[] array = new int[sizeOfArray];
        Random rd = new Random();
        //Loop use to random each element of array
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = rd.nextInt(sizeOfArray);
        }
        return array;
    }

    public static void DisplayArray(String msg, int[] arr) {
        System.out.print(msg);
        System.out.print("[");
        //Loop use to accessed each element of array and display
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            //Check index to Display comma
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
    }
    public static int LinearSearch(int[] arr,int search) {
         for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return i;
            }
        }
        return -1;
    }

    public static void DisplayIndex(String msg, int index) {
            System.out.println(msg+index);
          
            
    }


    

}
