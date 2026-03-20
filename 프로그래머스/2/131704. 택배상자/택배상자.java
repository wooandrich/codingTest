import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        int n = order.length;
        
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i=1;i<=n;i++) q.add(i);
        
        for (int num : order) {
            boolean isOk = false;
            while (true) {
                if (q.isEmpty() && !stack.isEmpty() && stack.peek() != num) break;
                
                if (!q.isEmpty() && num == q.peek()) {
                    isOk = true;
                    q.poll();
                    break;
                }
                
                if (!stack.isEmpty() && stack.peek() == num) {
                    isOk = true;
                    stack.pop();
                    break;
                }
                
                if (!q.isEmpty()) stack.push(q.poll());
            }
            
            if (isOk) answer++;
            else break;
        }
        
        return answer;
    }
}