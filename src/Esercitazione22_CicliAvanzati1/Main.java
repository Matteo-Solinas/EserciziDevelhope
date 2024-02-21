package Esercitazione22_CicliAvanzati1;

public class Main {

    public static void main(String[] args) {

        int testInputNumber = 20;

        printAllValuesUntil5(testInputNumber);

    }

    // print all value from 0 to an input number but stops at number 5
    public static void printAllValuesUntil5(int inputNumber) {
        for (int i = 0; i <= inputNumber; i++) {
            if (i == 5) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
