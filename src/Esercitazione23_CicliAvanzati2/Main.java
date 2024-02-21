package Esercitazione23_CicliAvanzati2;

public class Main {


    /** Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
     * e stampa tutti i numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.*/
    public static void main(String[] args) {

        int inputNumber = 10;

        printAllValuesBut5(inputNumber);

    }

    // print all value from 0 to an input number and skip number 5
    public static void printAllValuesBut5(int inputNumber) {
        for (int i = 0; i <= inputNumber; i++) {
            if (i == 5) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
