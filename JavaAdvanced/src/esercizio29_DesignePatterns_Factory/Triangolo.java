package esercizio29_DesignePatterns_Factory;

public class Triangolo implements Shape{

    @Override
    public void draw() {
        System.out.println("Sto disegnando un triangolo");
    }

    @Override
    public String toString() {
        return "Triangolo{}";
    }
}
