/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package matrix;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vip2021
 */
public class CalculatorProgramTest {
    CalculatorProgram calculator = new CalculatorProgram();
   @Test
    public void testAdditionMatrix() {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };
        int[][] expected = {
            {8, 10, 12},
            {14, 16, 18}
        };
        assertArrayEquals(expected, calculator.additionMatrix(matrix1, matrix2));
    }

    @Test
    public void testSubtractionMatrix() {
        int[][] matrix1 = {
            {7, 8, 9},
            {10, 11, 12}
        };
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] expected = {
            {6, 6, 6},
            {6, 6, 6}
        };
        assertArrayEquals(expected, calculator.subtractionMatrix(matrix1, matrix2));
    }

    @Test
    public void testMultiplicationMatrix() {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        int[][] expected = {
            {58, 64},
            {139, 154}
        };
        assertArrayEquals(expected, calculator.multiplicationMatrix(matrix1, matrix2));
    }

    @Test
    public void testAdditionMatrixDifferentSize() {
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {5, 6, 7},
            {8, 9, 10}
        };
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.additionMatrix(matrix1, matrix2);
        });
    }

    @Test
    public void testSubtractionMatrixDifferentSize() {
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {5, 6, 7},
            {8, 9, 10}
        };
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.subtractionMatrix(matrix1, matrix2);
        });
    }

}
