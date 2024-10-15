import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> s = new Stack<>();
        
        int price = prices[0];
        s.add(0);
        
        for (int i=1;i<prices.length - 1;i++) {
            int idx = s.peek();
            
            if (prices[idx] > prices[i]) {
                while (!s.isEmpty() && prices[s.peek()] > prices[i]) {
                    idx = s.pop();
                    answer[idx] = i - idx;
                }
            }
            s.add(i);
        }
        while (!s.isEmpty()) {
            int a = prices.length - 1;
            int b = s.pop();
            answer[b] = a - b;
        }
        
        
        return answer;
    }
}