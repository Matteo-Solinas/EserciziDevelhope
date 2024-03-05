package Esercitazione_3_03_Polimorfismo;

public class Main {
    /*A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area, aggiungere una ulteriore
     classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura.*/
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(2, 3);
        Rettangolo rettangolo2 = new Rettangolo(12, 23.5f);
        Triangolo triangolo1 = new Triangolo(3, 3);

        System.out.println("area del rettangolo1: " + rettangolo1.calcolaArea());
        System.out.println("area del rettangolo2: " + rettangolo2.calcolaArea());
        System.out.println("area del triangolo1: " + triangolo1.calcolaArea());

    }
}
