package RkDSA.KC.LeetCodeProblems;

import java.util.Arrays;

public class Paper {

    public static void main(String[] args) {
        int[] arr = {43, 345, 20, 987};
        System.out.println(Arrays.toString(delivery(arr)));
    }

    public static int[] delivery(int[] orderID) {
        int[] answer = new int[100];
        answer = new int[orderID.length];
        for (int i = 0; i < orderID.length; i++) {
            answer[i] = getSum(orderID[i]);
        }
        return answer;
    }

    public static int getSum(int id) {
        int sum = 0;
        while (id > 0) {
            sum += id % 10;
            id = id / 10;
        }

        return sum;
    }
}
