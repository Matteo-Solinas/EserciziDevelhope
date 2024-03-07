package Esercitazione_3_06_Enum;

public class Triangolo extends Forma {

    private float base;
    private float altezza;

    public Triangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
        super.setTipo(TipoForma.TRIANGOLO);
    }

    public double getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    @Override
    public float calcolaArea() {
        return (base * altezza) / 2;
    }
}
