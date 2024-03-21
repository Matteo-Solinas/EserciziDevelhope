package esercizio15_Record_DataClass;

public class Main {

    //Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y

    public static void main(String[] args) {

        Punto punto1 = new Punto(24.84, 53.91);
        Punto punto2 = new Punto(-24.84, 53.91);
        Punto punto3 = new Punto(24.84, -53.91);
        Punto punto4 = new Punto(-24.8, -53.91);

        System.out.println("punto1 = " + punto1);
        System.out.println("punto2 = " + punto2);
        System.out.println("punto3 = " + punto3);
        System.out.println("punto4 = " + punto4);

        System.out.println();
        System.out.println("il punto1 e il punto4 sono uguali? " + punto1.equals(punto4));
        System.out.println("il punto2 e il punto3 sono uguali? " + punto2.equals(punto3));

    }

}
