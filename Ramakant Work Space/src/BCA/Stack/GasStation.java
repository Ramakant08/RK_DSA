package BCA.Stack;

import java.util.Stack;

public class GasStation {
    static int solve(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        for (int i = 0; i < cost.length; i++) {
            sumGas += gas[i];
            sumCost += cost[i];
        }
        if (sumCost < sumGas) {
            return -1;
        }
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        int fuel = 0;
        for (int i = 0; i < gas.length; i++) {
            fuel = fuel + gas[i] - cost[i];
            if (fuel < 0) {
                stack.clear();
                fuel = 0;
                start = i + 1;
            } else {
                stack.push(i);
            }
        }

        return stack.isEmpty() ? start : stack.firstElement();

    }
}
