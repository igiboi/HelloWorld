public class WhileLoopChallenge {
    public static void main(String[] args) {
        int countOfEvens = 0;
        int sumOfEvens = 0;
        int currentNumber = 5;
        while (currentNumber <= 20 && countOfEvens < 5) {
            if (IsEvenNumber(currentNumber)) {
                countOfEvens++;
                sumOfEvens += currentNumber;
                System.out.println(currentNumber + " is even");
            } else {
                System.out.println(currentNumber + " is odd");
            }
            currentNumber++;
        }
        System.out.println("Sum of even numbers found = " + sumOfEvens);
    }

    public static boolean IsEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
