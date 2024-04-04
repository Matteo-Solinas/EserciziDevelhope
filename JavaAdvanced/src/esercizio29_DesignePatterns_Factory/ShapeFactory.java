package esercizio29_DesignePatterns_Factory;

public class ShapeFactory {

    public static Shape drawShape(ShapeType shapeType){
        Shape shape = null;

        if(shapeType.equals(ShapeType.QUADRATO)){
            shape = new Quadrato();
        } else if (shapeType.equals(ShapeType.TRIANGOLO)) {
            shape = new Triangolo();
        } else if (shapeType.equals(ShapeType.CERCHIO)) {
            shape = new Cerchio();
        }

        return shape;
    }



}
