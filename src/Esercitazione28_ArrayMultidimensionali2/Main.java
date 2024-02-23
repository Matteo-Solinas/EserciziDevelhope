package Esercitazione28_ArrayMultidimensionali2;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("matrice stampata normalmente");
        printMatrix(matrix);
        System.out.println("matrice con colonne e righe scambiate");
        printMatrix(swapMatrixColumnsWithRows(matrix));

    }

    //print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }

    // swap columns and rows of a matrix
    public static int[][] swapMatrixColumnsWithRows(int[][] matrix) {
        int reverseColumns = matrix.length;
        int reverseRows = matrix[0].length;

        int[][] swappedMatrix = new int[reverseRows][reverseColumns];

        for (int i = 0; i < reverseRows; i++) {
            for (int j = 0; j < reverseColumns; j++) {
                swappedMatrix[i][j] = matrix[j][i];
            }
        }
        return swappedMatrix;
    }


}



