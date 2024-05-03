package Esercitazione_3_02_Ereditarietà2;

public class Rettangolo extends Forma {

    private float base;
    private float altezza;

    public Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    @Override
    public float calcolaArea() {
        float area = 0;
        if (base != altezza) {
            area = base * altezza;
        } else {
            System.out.println("Non è un quadrato, base e altezza devono essere diversi");
        }
        return area;
    }

}
