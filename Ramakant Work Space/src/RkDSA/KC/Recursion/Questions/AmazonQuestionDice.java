package RkDSA.KC.Recursion.Questions;

public class AmazonQuestionDice {

    public static void main(String[] args) {
        int target=5;
        dice("",target);
    }
    public static void dice(String processed, int target) {
        if (target == 0) {
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(processed + i, target - i);
        }

    }
}
