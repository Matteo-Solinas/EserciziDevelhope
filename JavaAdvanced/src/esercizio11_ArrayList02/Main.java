package esercizio11_ArrayList02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    /* Creare una classe Student che accetti nel costruttore il parametro name (String e age Int).
       In questa classe avere i metodi pubblici per ottenere le informazioni.
       Creare un ArrayList con 12 elementi e stamparlo in console.
       Mettere in ordine la collezione e stampare il risultato. */

    public static void main(String[] args) {

        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(

                new Student("Paolo", 25), new Student("Matteo", 32),
                new Student("Franco", 26), new Student("Carla", 30),
                new Student("Maria", 27), new Student("Marco", 29),
                new Student("Gianpaolo", 25), new Student("Ivan", 30),
                new Student("Davide", 26), new Student("Chiara", 22),
                new Student("Pippo", 30), new Student("Luigi", 31)

        ));

        System.out.println("Lista non ordinata");
        for (Student student : studentsList) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Elementi della lista ordinati per nome");
        studentsList.sort(Comparator.comparing(Student::getName));
        for (Student student : studentsList) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Elementi della lista ordinati per età");
        studentsList.sort(Comparator.comparingInt(Student::getAge));
        for (Student student : studentsList) {
            System.out.println(student);
        }

    }

}
