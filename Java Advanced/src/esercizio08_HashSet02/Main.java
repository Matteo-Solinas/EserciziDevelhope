package esercizio08_HashSet02;

import java.util.HashSet;
import java.util.Set;

public class Main {

//    Scrivere una funzione che restituisca un HashSet riempito
//    Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//    Verificare che l' elemento sia parte del Set e stampare il risultato

    public static void main(String[] args) {
        Set<String> colors = colorsHashSet();
        String testStr1 = "Arancione";
        String testStr2 = "Bianco";

        boolean isPresent1 = colors.contains(testStr1);
        boolean isPresent2 = colors.contains(testStr2);

        System.out.println("Il colore: '" + testStr1 + "' è presente all'interno dell'HashSet colors? "+ isPresent1);
        System.out.println("Il colore: '" + testStr2 + "' è presente all'interno dell'HashSet colors? "+ isPresent2);

    }

    public static Set<String> colorsHashSet() {
        Set<String> colors = new HashSet<>();

        colors.add("Rosso");
        colors.add("Verde");
        colors.add("Giallo");
        colors.add("Bianco");
        colors.add("Nero");
        return colors;
    }
}
