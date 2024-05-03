package Esercitazione_2_03_IncapsulamentoEModificatori;

public class Auto {
    private String marca;
    private String modello;
    private String targa;
    private String cilindrata;

    public Auto(String marca, String modello, String targa, String cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getTarga() {
        return targa;
    }

    public String getCilindrata() {
        return cilindrata;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }
}
