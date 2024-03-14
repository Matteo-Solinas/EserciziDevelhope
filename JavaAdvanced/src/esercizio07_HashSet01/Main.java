package esercizio07_HashSet01;

import java.util.HashSet;
import java.util.Set;

public class Main {

//    Scrivere una funzione che restituisca un hashSet riempito
//    Leggere l'hashSet e stampare grandezza ed elementi

    public static void main(String[] args) {
        Set<String> names = namesHashSet();

        //stampa contenuto Set
        System.out.println("nomi all'interno dell' hashSet names: " +  names);
        System.out.println();

        //stampa con ciclo for
        System.out.println("nomi all'interno dell' hashSet names con ciclo for:");
        for (String name: names) {
            System.out.println(name);
        }

        System.out.println();
        //mostra grandezza hashSet
        int setSize = names.size();
        System.out.println("numero nomi dentro hashSet names: " + setSize);
    }

    public static Set<String> namesHashSet() {
        Set<String> names = new HashSet<>();

        names.add("Mario");
        names.add("Maria");
        names.add("Marco");
        names.add("Marta");
        names.add("Matteo");
        return names;
    }
}
