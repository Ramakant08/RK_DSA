package RkDSA.KC.LinkedList.Questions;

public class FindHappyOrNot {

    public boolean ifHappy(int num) {
        int fast = num;
        int slow = num;
        do {
            fast = sumOfSquareOfDigit(sumOfSquareOfDigit(fast));
            slow = sumOfSquareOfDigit(slow);
        } while (fast != slow);
        if (slow == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static int sumOfSquareOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum += temp * temp;
            num = num / 10;
        }

        return sum;
    }
}

class HappyRunner {

    public static void main(String[] args) {
        FindHappyOrNot findHappyOrNot = new FindHappyOrNot();
        System.out.println(findHappyOrNot.ifHappy(20));
    }
}





