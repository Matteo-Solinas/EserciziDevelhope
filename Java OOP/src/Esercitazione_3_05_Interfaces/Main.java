package Esercitazione_3_05_Interfaces;

public class Main {
    /*Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
      Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo
      per il calcolo dell'area.*/
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(10, 5);
        Rettangolo rettangolo2 = new Rettangolo(4.5f, 11.2f);
        Triangolo triangolo1 = new Triangolo(10, 15);
        Triangolo triangolo2 = new Triangolo(15.5f, 10.2f);

        System.out.println("Area del rettangolo1: " + rettangolo1.calcolaArea());
        System.out.println("Area del rettangolo2: " + rettangolo2.calcolaArea());
        System.out.println("Area del triangolo1: " + triangolo1.calcolaArea());
        System.out.println("Area del triangolo2: " + triangolo2.calcolaArea());
    }
}
