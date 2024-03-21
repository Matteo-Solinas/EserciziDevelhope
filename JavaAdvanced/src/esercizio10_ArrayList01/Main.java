package esercizio10_ArrayList01;

import java.util.ArrayList;

public class Main {

    /* Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int).
       In questa classe avere i metodi pubblici per ottenere le informazioni.
       Creare un ArrayList con n elementi e stamparlo in console.
       Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console. */

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Paolo", 25);
        Student student2 = new Student("Franco", 26);

        studentList.add(student1);
        studentList.add(student2);

        System.out.println(studentList);

        Student student3 = new Student("Matteo", 32);
        Student student4 = new Student("Carla", 30);
        Student student5 = new Student("Maria", 27);
        Student student6 = new Student("Marco", 29);

        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        System.out.println();
        System.out.println("---- lista aggiornata ----");
        System.out.println(studentList);

    }

}
