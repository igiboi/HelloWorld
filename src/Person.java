public class Person {
    private String name;
    private int age;

    public Person(String initialName, int initialAge) {
        this.name = initialName;
        this.age = initialAge;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public static void main(String[] args) {
        Person Luigi = new Person("Luigi", 29);
        Person Morty = new Person("Morty", 27);

        Luigi.printPerson();
        Morty.printPerson();
    }
}
