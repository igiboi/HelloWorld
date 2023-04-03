public class Agent {
    String firstName;
    String lastName;

    public Agent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "My name is" + lastName + firstName + lastName;
    }
    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");
        bond.toString();

        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);


    }
}
