public class Multiplier {
   private int multiplier;

    public Multiplier(int number) {
        multiplier = number;
    }

    public int multiply(int number) {
        return number * multiplier;
    }

    public static void main(String[] args) {
        Multiplier multiplyByThree = new Multiplier(3);

        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

    }


}
