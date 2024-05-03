package Esercitazione_3_02_Ereditarietà2;

public class Main {
    /* Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea()
      che stampi l'area della forma. Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
      per calcolare l'area del rettangolo. */

    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(2.5f, 3.4f);
        Rettangolo rettangolo2 = new Rettangolo(12, 23.5f);

        System.out.println("area del rettangolo1: " + rettangolo1.calcolaArea());
        System.out.println("area del rettangolo2: " + rettangolo2.calcolaArea());

        rettangolo1.setBase(4);
        rettangolo1.setAltezza(5);

        System.out.println("---secondo calcolo----");
        System.out.println("area del rettangolo1: " + rettangolo1.calcolaArea());


    }
}
