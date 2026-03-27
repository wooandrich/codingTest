import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        long sum1 = 0;
        long sum2 = 0;
        long target = 0;
        int limit = queue1.length * 3;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for (int n : queue1) {
            sum1 += n;
            q1.add(n);
        }
        
        for (int n : queue2) {
            sum2 += n;
            q2.add(n);
        }
        target = sum1 + sum2;
        if (target % 2 != 0) return -1;
        
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (answer > limit) return -1;
            if (sum1 == sum2) break;
            
            if (sum1 > sum2) {
                sum1 -= q1.peek();
                sum2 += q1.peek();
                
                q2.add(q1.poll());
                answer++;
            } else if (sum2 > sum1) {
                sum1 += q2.peek();
                sum2 -= q2.peek();
                
                q1.add(q2.poll());
                answer++;
            }
        }
        if (q1.isEmpty() || q2.isEmpty()) return -1;
        
        return answer;
    }
}