/**
 * 01-java-basics/step-07-arrays-and-data-structures: MatrixOperations.java
 * ==========================================================================
 * Core Concepts Demonstrated:
 * 1. 2D Arrays (Matrices) in Java.
 * 2. Matrix Addition ($C[i][j] = A[i][j] + B[i][j]$).
 * 3. Matrix Multiplication ($C[i][j] = \sum A[i][k] \times B[k][j]$).
 * 4. Matrix Transpose (Swapping rows and columns $M[i][j] \to M[j][i]$).
 */
public class Step13_MatrixOperations {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("      2D Array & Matrix Operations       ");
        System.out.println("=========================================");

        // 2x3 Matrix A
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // 2x3 Matrix B
        int[][] matrixB = {
            {7, 8, 9},
            {1, 2, 3}
        };

        // --- 1. Matrix Addition ---
        System.out.println("\n--- 1. Matrix Addition (A + B) ---");
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] sumMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        // --- 2. Matrix Transpose ---
        System.out.println("\n--- 2. Transpose of Matrix A (3x2) ---");
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrixA[i][j];
            }
        }

        // Print Transpose
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        // --- 3. Matrix Multiplication ---
        System.out.println("\n--- 3. Matrix Multiplication (2x3 * 3x2) ---");
        // Matrix C (3x2)
        int[][] matrixC = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        // Result of A (2x3) * C (3x2) will be (2x2)
        int[][] product = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    product[i][j] += matrixA[i][k] * matrixC[k][j];
                }
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("=========================================");
    }
}
