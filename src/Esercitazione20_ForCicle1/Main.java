package Esercitazione20_ForCicle1;

public class Main {

    public static void main(String[] args) {

        /**Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
         * e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.
         */

        int inputNumber = 7;

        multiplicationTable(inputNumber);

    }

    // print all value of an arithmetic table
    public static void multiplicationTable(int number) {
        System.out.println("Tabellina del numero " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
