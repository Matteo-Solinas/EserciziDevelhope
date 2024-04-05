package esercizio31_DesignPatterns_SingletonAndStatic;

public class Main {

    /* Crea una classe User che abbia i parametri privati nome ed età e i getter e setter.
       All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
       Creare 2 oggetti User di cui creerà un'istanza.
       Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi
       si stamperanno a video. */

    private static User instance;

    public static User createInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public static void main(String[] args) {

        User user1 = createInstance();
        System.out.println("Informazioni user1");
        user1.printInfo();
        System.out.println();

        User user2 = createInstance();
        user2.setName("Mario");
        user2.setAge(39);

        System.out.println("Informazioni aggiornate user1 e user2");
        System.out.println("---- Info user1 ----");
        user1.printInfo();
        System.out.println();

        System.out.println("---- Info user2 ----");
        user2.printInfo();
    }

}
