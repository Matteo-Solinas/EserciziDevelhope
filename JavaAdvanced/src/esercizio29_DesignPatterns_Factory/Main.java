package esercizio29_DesignPatterns_Factory;

public class Main {

    /* Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
       Crea una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc).
       Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
       Stampa a video il risultato della funzione draw di ogni shape creata. */

    public static void main(String[] args) {

        Shape quadrato = ShapeFactory.drawShape(ShapeType.QUADRATO);
        Shape triangolo = ShapeFactory.drawShape(ShapeType.TRIANGOLO);
        Shape cerchio = ShapeFactory.drawShape(ShapeType.CERCHIO);

        quadrato.draw();
        triangolo.draw();
        cerchio.draw();

    }

}
