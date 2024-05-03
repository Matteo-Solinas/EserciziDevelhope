package esercizio06_Autoboxing_Unboxing;

public class Main {

    /*Scrivere una funzione che accetti in input 2 int e ne stampi la somma
      Scrivere una funzione che accetti in input 1 char lo stampi
      Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
      Scrivere una funzione che accetti in input 1 Character lo stampi
      Scrivere un un valore primitivo per int, double e char e fare autoboxing
      Scrivere un oggetto per Integer, Double e Character e fare Unboxing*/

    public static void main(String[] args) {

        int num1 = 3;
        double dbl1 = 6.3;
        char char1 = 'G';
        Integer number1 = num1;
        Double double1 = dbl1;
        Character carattere1 = char1;

        Integer newInteger = 9;
        Double newDouble = 8.4;
        Character newCharacter = 'S';
        int newNum = newInteger;
        double newDbl = newDouble;
        char newChar = newCharacter;

        sum(num1, newNum);
        printChar(newChar);

        sumInteger(number1, newInteger);
        printCharacter(carattere1);
    }

    public static void sum(int num1, int num2) {
        System.out.println("Somma int: " + (num1 + num2));
    }

    public static void printChar(char char1) {
        System.out.println("char: " + char1);
    }

    public static void sumInteger(Integer num1, Integer num2) {
        System.out.println("Somma Integer: " + Integer.sum(num1, num2));
    }

    public static void printCharacter(Character character1) {
        System.out.println("Character: " + character1);
    }

}
