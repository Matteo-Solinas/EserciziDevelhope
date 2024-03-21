package esercizio13_HashMap01;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {

    //Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.

    public static void main(String[] args) {

        Veicolo auto1 = new Veicolo("Fiat", "Panda");
        Veicolo moto1 = new Veicolo("Kawasaki", "Ninja");
        Veicolo furgone1 = new Veicolo("Fiat", "Ducato");

        System.out.println("Inizializzazione e stampa elementi mappa con costruttore");
        Map<String, Veicolo> map1 = new HashMap<>();
        map1.put("Auto", auto1);
        map1.put("Moto", moto1);
        map1.put("Furgone", furgone1);
        System.out.println("elementi map1 = " + map1);
        System.out.println();

        System.out.println("Inizializzazione e stampa elementi mappa con Map.Of()");
        Map<String, Veicolo> map2 = Map.of("Auto", auto1, "Moto", moto1, "Furgone", furgone1);
        System.out.println("elementi map2 = " + map2);
        System.out.println();

        System.out.println("Inizializzazione e stampa elementi mappa con Map.ofEntries()");
        Map<String, Veicolo> map3 = new HashMap<>(Map.ofEntries(

                new AbstractMap.SimpleEntry<>("Auto", auto1),
                new AbstractMap.SimpleEntry<>("Moto", moto1),
                new AbstractMap.SimpleEntry<>("Furgone", furgone1)

        ));
        System.out.println("elementi map3 = " + map3);

    }

}
