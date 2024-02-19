package Esercitazione09_operatoriAritmetici3;

public class Main {

    public static void main(String[] args) {

        System.out.println("la media è: " + media(21, 34, 47));

    }

    public static double media(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }
}
