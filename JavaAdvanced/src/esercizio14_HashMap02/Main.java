package esercizio14_HashMap02;

import java.util.*;

public class Main {

    //Creare un hashmap, prendere tutti i valori, ordinarli e stamparli

    public static void main(String[] args) {

        Veicolo auto1 = new Veicolo("Fiat", "Panda");
        Veicolo moto1 = new Veicolo("Kawasaki", "Ninja");
        Veicolo furgone1 = new Veicolo("Dacia", "Dokker");

        Map<String, Veicolo> map1 = Map.of("Auto", auto1, "Moto", moto1, "Furgone", furgone1);
        System.out.println("elementi non ordinati " + map1);
        System.out.println();

        List<Map.Entry<String, Veicolo>> lst = new ArrayList<>(map1.entrySet());
        lst.sort(Map.Entry.comparingByKey());

        System.out.println("Mappa ordinata per key");
        for (Map.Entry<String, Veicolo> entry : lst) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        lst.sort(Map.Entry.comparingByValue(Comparator.comparing(Veicolo::getBrand)));
        System.out.println("Mappa ordinata per brand");
        for (Map.Entry<String, Veicolo> entry : lst) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        lst.sort(Map.Entry.comparingByValue(Comparator.comparing(Veicolo::getModel)));
        System.out.println("Mappa ordinata per model");
        for (Map.Entry<String, Veicolo> entry : lst) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
