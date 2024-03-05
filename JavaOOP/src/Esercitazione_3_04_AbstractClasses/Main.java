package Esercitazione_3_04_AbstractClasses;

public class Main {
    /*Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
      Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area
       in maniera specifica.*/
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(4, 5);
        Rettangolo rettangolo2 = new Rettangolo(6.5f, 3.5f);
        Triangolo triangolo1 = new Triangolo(3, 4);
        Triangolo triangolo2 = new Triangolo(9, 6);

        System.out.println("area dell rettangolo1: " + rettangolo1.calcolaArea());
        System.out.println("area dell rettangolo2: " + rettangolo2.calcolaArea());
        System.out.println("area dell triangolo1: " + triangolo1.calcolaArea());
        System.out.println("area dell triangolo2: " + triangolo2.calcolaArea());
    }
}
