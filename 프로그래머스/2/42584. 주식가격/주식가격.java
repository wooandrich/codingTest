import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Arrays.fill(answer, 0);
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i=0; i < prices.length; i++) {
            
            while (!stack.isEmpty() && (prices[stack.peek()] > prices[i] || i == prices.length - 1)) {
                answer[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        
        return answer;
    }
}