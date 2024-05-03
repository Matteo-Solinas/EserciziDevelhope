package Esercitazione27_ArrayMultidimensionali1;

public class Main {

    /*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice riempita
      con dei valori a vostro piacimento e restituisca la somma degli elementi sulla prima riga.*/

    public static void main(String[] args) {

        int[][] matrix = createMatrix();

        int[][] testMatrix = {{10, 10, 10, 10, 10}, {20, 20, 20, 20, 20}};

        System.out.println("the sum of the elements in the first row of the array matrix is: " + sumValuesRow(matrix, 0));
        System.out.println("the sum of the elements in the second row of the array matrix is: " + sumValuesRow(matrix, 1));

        System.out.println("the sum of the elements in the first row of the array testMatrix is: " + sumValuesRow(testMatrix, 0));
        System.out.println("the sum of the elements in the second row of the array testMatrix is: " + sumValuesRow(testMatrix, 1));
    }

    //creates and prints a multidimensional array in two rows;
    public static int[][] createMatrix() {
        int[][] matrix = {{3, 6, 9, 12, 15}, {5, 10, 15, 20, 25}};

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.print("}");
            System.out.println();
        }

        return matrix;
    }

    //sum all elements of a chosen row of the multidimensional array;
    public static int sumValuesRow(int[][] array, int row) {
        int sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[row][i];
        }
        return sum;
    }
}
