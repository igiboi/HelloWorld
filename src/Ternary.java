public class Ternary {
    public static void main(String[] args) {


//        String makeOfCar = "Honda";
//        boolean isDomestic = !makeOfCar.equals("Honda");
//
//        if (isDomestic) {
//            System.out.println("this car is domestic to our country");
//        }
//
//        int ageOfClient = 20;
//        String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
//        System.out.println("Our Client is " + ageText);

        double myFirst = 20.50;
        double mySecond = 80.40;

        double result = (myFirst + mySecond) * 100.00;

        double remainder = result % 40.00;

        boolean isRemainderZero = remainder == 0.00;

        System.out.println(isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("there is a remainder");
        } else {
            System.out.println("there is no remainder left");
        }
    }

}
