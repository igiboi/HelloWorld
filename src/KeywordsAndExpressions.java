public class KeywordsAndExpressions {
    public static void main(String[] args) {
        int highScore = 90; // statement
        int health = 100; //statement

        if((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}
// Expressions:
//
//        90 (assigned to highScore)
//        100 (assigned to health)
//        health < 25
//        highScore > 1000
//        highScore - 1000

// Statements:
//
//        int highScore = 90;
//        int health = 100;
//        if((health < 25) && (highScore > 1000)) { highScore = highScore - 1000; }
//        Note that the entire if statement is considered a single statement, which includes several expressions.