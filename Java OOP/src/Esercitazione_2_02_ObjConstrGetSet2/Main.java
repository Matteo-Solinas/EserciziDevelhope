package Esercitazione_2_02_ObjConstrGetSet2;

public class Main {
    /*Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa,
      marca e modello. Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
      Nel main dichiarare un oggetto di tipo Auto.*/
    public static void main(String[] args) {

        Auto auto1 = new Auto("Fiat", "Punto", "AA123BB", "1200cc");
        System.out.println("Dati auto");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());
        System.out.println("Targa veicolo: " + auto1.getTarga());
        System.out.println("Cilindrata: " + auto1.getCilindrata());

    }
}
