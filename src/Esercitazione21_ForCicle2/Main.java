package Esercitazione21_ForCicle2;

public class Main {

    public static void main(String[] args) {

        int startingNumber = 15;
        int maxResults = 6;

        reverseNumbers(startingNumber, maxResults);

    }
    // takes a number and a max number of results and print all natural numbers in reverse order;
    public static void reverseNumbers (int startingNumber, int maxResults) {
            for (int i = 0; i < maxResults; i++) {
            System.out.println(startingNumber);
            startingNumber--;
        }
    }
}
