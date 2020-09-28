package hachi.algorithmstudy.programmers.stack;

import java.util.Stack;

public class StockPrice {
    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > prices[i + 1]) {
                answer[i] = 1;
                stack.push(new int[] { prices[i + 1], i + 1 });
            } else {
                while (stack.size() > 0 && stack.peek()[0] >= prices[i]) {
                    stack.pop();
                }
                if (stack.size() == 0) {
                    answer[i] = prices.length - i - 1;
                } else {
                    answer[i] = stack.peek()[1] - i;
                }
            }
        }
        return answer;
    }
}
