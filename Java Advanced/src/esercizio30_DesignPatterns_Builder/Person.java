package esercizio30_DesignPatterns_Builder;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Person(PersonBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.address = builder.getAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", age: " + age +
                ", address: '" + address + '\'' +
                ']';
    }

}
