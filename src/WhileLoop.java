public class WhileLoop {
    public static void main(String[] args) {
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

//        adding continue to ignore certain number and continue the loop
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.println(number );
        }
    }
}
