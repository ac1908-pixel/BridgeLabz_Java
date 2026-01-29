package corePrograms.methods.level3;

import java.util.Random;

/*
 Program to perform matrix operations
*/
class MatrixOperations {

    // method to generate random matrix
    public static double[][] createMatrix(int rows, int cols) {
        Random r = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = r.nextInt(9) + 1;
        return matrix;
    }

    // method to add matrices
    public static double[][] add(double[][] a, double[][] b) {
        int r = a.length, c = a[0].length;
        double[][] result = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    // method to subtract matrices
    public static double[][] subtract(double[][] a, double[][] b) {
        int r = a.length, c = a[0].length;
        double[][] result = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    // method to multiply matrices
    public static double[][] multiply(double[][] a, double[][] b) {
        int r = a.length, c = b[0].length;
        double[][] result = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < b.length; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    // method to transpose matrix
    public static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    // method for determinant 2x2
    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    // method for determinant 3x3
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // method for inverse 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;
        return inv;
    }

    // method to display matrix
    public static void display(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.printf("%6.2f ", m[i][j]);
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args) {

        double[][] A = createMatrix(2, 2);
        double[][] B = createMatrix(2, 2);

        System.out.println("Matrix A:");
        display(A);

        System.out.println("Matrix B:");
        display(B);

        System.out.println("Addition:");
        display(add(A, B));

        System.out.println("Subtraction:");
        display(subtract(A, B));

        System.out.println("Multiplication:");
        display(multiply(A, B));

        System.out.println("Transpose of A:");
        display(transpose(A));

        System.out.println("Determinant of A = " + determinant2x2(A));

        System.out.println("Inverse of A:");
        display(inverse2x2(A));
    }
}

