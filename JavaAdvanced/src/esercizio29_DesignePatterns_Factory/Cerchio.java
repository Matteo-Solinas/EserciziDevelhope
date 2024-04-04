package esercizio29_DesignePatterns_Factory;

public class Cerchio implements Shape{

    @Override
    public void draw() {
        System.out.println("Sto disegnando un cerchio");
    }

    @Override
    public String toString() {
        return "Cerchio{}";
    }
}
