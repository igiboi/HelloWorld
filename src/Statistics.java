public class Statistics {
    private int count;

    public Statistics() {
        // initialize the variable numberCount here
    }
    public void addNumber(int number) {
        // write code here
        count += number;
    }

    public int getCount() {
        // write code here
        return count;
    }

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}