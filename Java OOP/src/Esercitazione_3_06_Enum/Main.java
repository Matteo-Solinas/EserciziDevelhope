package Esercitazione_3_06_Enum;

public class Main {

    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(8, 4);
        Triangolo triangolo1 = new Triangolo(9,18);
        Rettangolo rettangolo2 = new Rettangolo(10, 20);
        Triangolo triangolo2 = new Triangolo(6,12);

        System.out.println("Il "+ rettangolo1.tipo + " con base: " + rettangolo1.getBase() + " e altezza: " +
                rettangolo1.getAltezza() + " ha un'area uguale a: "+ rettangolo1.calcolaArea());

        System.out.println("Il "+ triangolo1.tipo + " con base: " + triangolo1.getBase() + " e altezza: " +
                triangolo1.getAltezza() + " ha un'area uguale a: "+ triangolo1.calcolaArea());

        System.out.println("Il "+ rettangolo2.tipo + " con base: " + rettangolo2.getBase() + " e altezza: " +
                rettangolo2.getAltezza() + " ha un'area uguale a: "+ rettangolo2.calcolaArea());

        System.out.println("Il "+ triangolo2.tipo + " con base: " + triangolo2.getBase() + " e altezza: " +
                triangolo2.getAltezza() + " ha un'area uguale a: "+ triangolo2.calcolaArea());

    }
}
