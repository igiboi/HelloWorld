public class SumOdd {
    public static void main(String[] args) {
        boolean odd = isOdd(2);
        int sum = sumOdd(1, 20);
        System.out.println("Odd: " + odd);
        System.out.println("Sum: " + sum);
    }
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }
    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || end < start) {
            return -1;
        }
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
