package esercizio12_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    /* Creare una classe Fruit che accenti nel costruttore il parametro name (String)
        - In questa classe avere i metodi pubblici per ottenere le informazioni.
        - Creare un LinkedList con elementi e stamparlo in console.
        - Aggiungere un elemento al primo posto della lista e uno all'ultimo.
        - Stampare la collezione aggiornata. */

    public static void main(String[] args) {
        LinkedList<Fruit> fruitsList = new LinkedList<>(Arrays.asList(

                new Fruit("Mela"), new Fruit("Pera"),
                new Fruit("Banana"), new Fruit("Arancia"),
                new Fruit("Uva"), new Fruit("Pesca")

        ));

        System.out.println("Lista frutti");
        System.out.println(fruitsList);

        fruitsList.addFirst(new Fruit("Ananas"));
        fruitsList.addLast(new Fruit("Kiwi"));

        System.out.println();
        System.out.println("Lista frutti aggiornata");
        System.out.println(fruitsList);

    }

}
