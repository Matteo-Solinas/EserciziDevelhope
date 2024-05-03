package Esercitazione_3_06_Enum;

public abstract class Forma {

    public TipoForma tipo;

    public TipoForma getTipo() {
        return tipo;
    }

    public void setTipo(TipoForma tipo) {
        this.tipo = tipo;
    }

    public abstract float calcolaArea();


}
