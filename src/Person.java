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

    // growOlder() method has been added
    public void growOlder() {
        this.age = this.age + 1;
    }

    // the added method
    public int returnAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Person Luigi = new Person("Luigi", 29);
        Person Morty = new Person("Morty", 27);

        Luigi.growOlder();
        Luigi.growOlder();

        Morty.growOlder();

        System.out.println("Luigi's age:" + Luigi.returnAge());
        System.out.println("Morty's age:" + Morty.returnAge());

        int combined = Luigi.returnAge() + Morty.returnAge();

        System.out.println("Luigi's and Morty's combined age " + combined + " years");


    }
}
