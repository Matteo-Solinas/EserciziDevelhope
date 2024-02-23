package Esercitazione26_Array3;

import java.util.Arrays;

public class Main {

    /*Scrivere un programma che contenga un metodo che permetta di sostituire gli elementi duplicati
      in un array di interi con il valore -1.
      L'array ottenuto dovrà essere stampato a video.*/

    public static void main(String[] args) {
        int[] values = {1, 1, 3, 4, 5, 5};
        System.out.println(values.length);
        System.out.println("array con valori sostituiti: " + Arrays.toString(removeDuplicates(values)));

        int[] numeriACaso = {0, 1, 20, -1, 3, -4, 28, 12, 1, 0, 2, -4};
        TrovaESostituisciDuplicati(numeriACaso);
        System.out.println("array con valori sostituiti con metodo corretto : " + Arrays.toString(numeriACaso));

    }

    //takes an array, removes duplicate elements and swaps them with -1
    public static int[] removeDuplicates(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                newArray[j++] = array[i];
            } else {
                newArray[j++] = -1;
            }
        }
        newArray[j] = array[array.length - 1];

        return newArray;
    }

    // metodo corretto visto in live
    public static void TrovaESostituisciDuplicati(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] != -1) {
                for (int j = i + 1; j < arrayInt.length; j++) {
                    if (arrayInt[i] == arrayInt[j]) {
                        arrayInt[j] = -1;
                    }
                }
            }
        }
    }
}


