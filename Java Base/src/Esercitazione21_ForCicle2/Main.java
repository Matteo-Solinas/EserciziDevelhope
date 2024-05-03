package Esercitazione21_ForCicle2;

public class Main {

    public static void main(String[] args) {

        int number = 15;
        int maxResults = 6;

        reverseNumbers(number, maxResults);

    }

    //takes a number and prints all the natural numbers in reverse order until it reaches a maximum result ;
    public static void reverseNumbers(int number, int maxResults) {
        for (int i = 0; i < maxResults; i++) {
            System.out.println(number);
            number--;
        }
    }
}
