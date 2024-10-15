import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int s : scoville) {
            pq.add(s);
        }
        
        while (true) {
            if (pq.size() == 1) {
                if (pq.peek() < K) return -1;
            }
            
            int one = pq.poll();
            if (one >= K) break;
            int two = pq.poll();
            
            int t = one + two * 2;
            pq.add(t);
            answer++;
        }
        
        
        
        return answer;
    }
}