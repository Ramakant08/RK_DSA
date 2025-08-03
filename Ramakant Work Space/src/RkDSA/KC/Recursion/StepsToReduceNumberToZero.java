package RkDSA.KC.Recursion;


//steps
//if number is even devide it by two
//if number is odd subtract it by 1
public class StepsToReduceNumberToZero {
    public static void main(String[] args) {
        int i = 14;
        System.out.println(reduce(i, 0));
    }

    public static int reduce(int num, int counter) {

        if (num == 0) {
            return counter;
        }
        if (num % 2 == 0) {
            return reduce(num / 2, counter + 1);
        } else {
            return reduce(num - 1, counter + 1);
        }

    }
}
