public class SwitchStatements {
    public static void main(String[] args) {

//        printDayOfWeek(-7);
//        printDayOfWeekEnhanced(2);
        printNumberInWord(4);
    }
    public static void printDayOfWeek(int dayOfWeek) {
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    public static void printDayOfWeekEnhanced(int day) {
        String dayOfWeek = switch(day) {
            case 0 ->  "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";

        } ;

        System.out.println(day + " stands for " + dayOfWeek);
    }
    public static void printNumberInWord(int number) {
        String word;
        switch (number) {
            case 0 -> word = "ZERO";
            case 1 -> word = "ONE";
            case 2 -> word = "TWO";
            case 3 -> word = "THREE";
            case 4 -> word = "FOUR";
            case 5 -> word = "FIVE";
            case 6 -> word = "SIX";
            case 7 -> word = "SEVEN";
            case 8 -> word = "EIGHT";
            case 9 -> word = "NINE";
            default -> word = "OTHER";
        }
        System.out.println(word);
    }

}
