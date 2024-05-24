/**
 * This class represents a CalculatorProgram for matrix operations.
 */
public class CalculatorProgram {

    /**
     * Retrieves and populates the first matrix based on user input.
     * @return The populated first matrix.
     */
    public int[][] getMatrix1() {
        // Instantiate a GetInput object to facilitate user input
        GetInput input = new GetInput();

        // Prompt user for the number of rows and columns in the first matrix
        int row = input.GetInput("Enter Row Matrix 1: ");
        int col = input.GetInput("Enter Column Matrix 1: ");

        // Initialize a 2D array for the first matrix based on user-provided dimensions
        int[][] matrix1 = new int[row][col];

        // Populate the first matrix with user input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Prompt user to enter values for each element in the first matrix
                String msg = String.format("Enter Matrix1" + "[%d][%d]:", i + 1, j + 1);
                matrix1[i][j] = input.GetInput(msg);
            }
        }

        // Return the populated first matrix
        return matrix1;
    }

    /**
     * Retrieves and populates the second matrix based on user input and the dimensions of the first matrix.
     * @param matrix1 The first matrix.
     * @param choice The user's choice of matrix operation.
     * @return The populated second matrix.
     */
    public int[][] getMatrix2(int[][] matrix1, int choice) {
        // Instantiate a GetInput object to facilitate user input
        GetInput input = new GetInput();

        // Determine the dimensions of the first matrix
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;

        // Declare variables for the dimensions of the second matrix
        int row2, col2;

        // Check the choice to decide how to get dimensions for the second matrix
        if (choice == 1 || choice == 2) {
            // Prompt user for the number of rows in the second matrix
            do {
                row2 = input.GetInput("Enter Row Matrix 2: ");

                // Check if the number of rows is equal to the first matrix
                if (row2 != row1) {
                    System.out.println("The two matrices must be of the same size!!!");
                } else {
                    break;
                }
            } while (true);

            // Prompt user for the number of columns in the second matrix
            do {
                col2 = input.GetInput("Enter Column Matrix 2: ");

                // Check if the number of columns is equal to the first matrix
                if (col2 != col1) {
                    System.out.println("The two matrices must be of the same size!!!");
                } else {
                    break;
                }
            } while (true);
        } else {
            // Prompt user for the number of rows in the second matrix
            do {
                row2 = input.GetInput("Enter Row Matrix 2: ");

                // Check if the number of rows matches the columns of the first matrix
                if (row2 != col1) {
                    System.out.println("The number of columns of the matrix1 is equal to the number of rows of the matrix2!!!");
                }

                // Prompt user for the number of columns in the second matrix and break the loop
                col2 = input.GetInput("Enter Column Matrix 2: ");
                break;
            } while (true);
        }

        // Initialize a 2D array for the second matrix based on user-provided dimensions
        int[][] matrix2 = new int[row2][col2];

        // Populate the second matrix with user input
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                // Prompt user to enter values for each element in the second matrix
                String msg = String.format("Enter Matrix2" + "[%d][%d]: ", i + 1, j + 1);
                matrix2[i][j] = input.GetInput(msg);
            }
        }

        // Return the populated second matrix
        return matrix2;
    }

    /**
     * Adds two matrices and returns the result.
     * @param matrix1 The first matrix.
     * @param matrix2 The second matrix.
     * @return The result of matrix addition.
     */
    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        // Get the dimensions of the matrices
        int row = matrix1.length;
        int col = matrix1[0].length;

        // Initialize a 2D array for the result matrix
        int[][] result = new int[row][col];

        // Perform matrix addition
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Return the result matrix
        return result;
    }

    /**
     * Subtracts one matrix from another and returns the result.
     * @param matrix1 The first matrix.
     * @param matrix2 The second matrix.
     * @return The result of matrix subtraction.
     */
    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        // Get the dimensions of the matrices
        int row = matrix1.length;
        int col = matrix1[0].length;

        // Initialize a 2D array for the result matrix
        int[][] result = new int[row][col];

        // Perform matrix subtraction
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Return the result matrix
        return result;
    }

    /**
     * Multiplies two matrices and returns the result.
     * @param matrix1 The first matrix.
     * @param matrix2 The second matrix.
     * @return The result of matrix multiplication.
     */
    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        // Get the dimensions of the matrices
        int row1 = matrix1.length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        // Initialize a 2D array for the result matrix
        int[][] result = new int[row1][col2];

        // Perform matrix multiplication
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Return the result matrix
        return result;
    }

    public void displayResult(int[][] matrix1, int[][] matrix2, int[][] result, int choice) {
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                System.out.format("[%]",matrix1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("+");
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[i].length;j++){
                System.out.format("[%]",matrix2[i][j]);
            }
            System.out.println("");
        }
        System.out.println("=");
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.format("[%]",result[i][j]);
            }
            System.out.println("");
        }
    }
}
