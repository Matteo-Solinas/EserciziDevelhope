package esercizio31_DesignPatterns_SingletonAndStatic;

public class User {
    private String name;
    private int age;

    private static User instance;

    private User() {}

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Nome: " + name + "\n" + "Età: " + age);
    }
    
}
