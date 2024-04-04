package esercizio29_DesignePatterns_Factory;

public class Quadrato implements Shape{

    @Override
    public void draw() {
        System.out.println("Sto disegnando un quadrato");
    }

    @Override
    public String toString() {
        return "Quadrato{}";
    }
}
