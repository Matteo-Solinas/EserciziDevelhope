package esercizio09_HashSet03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Main {

    /* Create la struttura, La popolate e poi implementate una ricerca nel set a partire da un valore di input,
       se lo trovate allora lo togliete dal set. Fate in modo di trovare tutti i valori con cui avete popolato
       il set in modo che rimanga vuoto. A quel punto stampate il set per vedere che sia effettivamente vuoto. */

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Mela");
        fruits.add("Pera");
        fruits.add("Uva");
        fruits.add("Pesca");

        System.out.println(fruits);
        removeFruits(fruits, "Mela");
        System.out.println(fruits);
        removeFruits(fruits, "Pera");
        System.out.println(fruits);
        removeFruits(fruits, "Pesca");
        System.out.println(fruits);
        removeFruits(fruits, "Uva");
        System.out.println("Set vuoto: " + fruits);

    }

    public static void removeFruits(Set<String> fruits, String fruitToRemove) {
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();

            if (Objects.equals(fruit, fruitToRemove)) {
                iterator.remove();
            }
        }
    }
}
