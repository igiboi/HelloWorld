public class MethodOverload {
    public static void main(String[] args) {

        System.out.println("5ft, 11in = " + convertToCentimeters(5, 11) + "cm");
        System.out.println("194.54cm = " + convertToCentimeters(195) + "cm" );
    }
    public static double convertToCentimeters(int heightInches) {
        return heightInches + 2.54;
    }
    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = (feet * 12) + (inches * 12);
        return convertToCentimeters(totalInches);
    }

}
