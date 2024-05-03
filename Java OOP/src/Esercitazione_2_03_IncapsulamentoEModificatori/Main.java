package Esercitazione_2_03_IncapsulamentoEModificatori;

public class Main {
    /*Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa,
      marca e modello. Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
      Nel main dichiarare un oggetto di tipo Auto.
      In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.*/
    public static void main(String[] args) {

        Auto car1 = new Auto("Ford", "Focus", "AA123BB", "1300cc");
        System.out.println("Dati auto");
        System.out.println("Marca: " + car1.getMarca());
        System.out.println("Modello: " + car1.getModello());
        System.out.println("Targa veicolo: " + car1.getTarga());
        System.out.println("Cilindrata: " + car1.getCilindrata());

    }
}
