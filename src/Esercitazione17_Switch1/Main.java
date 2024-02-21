package Esercitazione17_Switch1;

public class Main {

    public static void main(String[] args) {

        /* Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
           e restituisca il nome del giorno della settimana come stringa o una stringa di errore nel caso
           di valore maggiore di 7 o minore di 1. */

        System.out.println(checkDayOfTheWeek(8));

    }

    //it takes a number from 1 to  7 and return a string with the day of the week;
    public static String checkDayOfTheWeek(int day) {
        String result;

        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Error: the number must be between 1 and 7";
                break;
        }

        return result;
    }
}
