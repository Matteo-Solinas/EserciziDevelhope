package Esercitazione_2_01_ObjConstrGetSet1;

public class Main {

    /*Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà
      nome, cognome ed identificativo. Per questa classe saranno necessari i metodi accessori (getters e setters)
      ed un costruttore. Nel main dichiarare un oggetto di tipo Studente.*/

    public static void main(String[] args) {

        Studente student1 = new Studente("001", "Matteo", "Solinas");
        System.out.println("Dati dello studente: " + student1.getId());
        System.out.println("Nome: " + student1.getName());
        System.out.println("Cognome: " + student1.getSurname());
        System.out.println("Numero identificativo: " + student1.getId());

    }
}
