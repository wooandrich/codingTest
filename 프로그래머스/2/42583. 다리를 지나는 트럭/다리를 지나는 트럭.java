import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> wait = new LinkedList<>();
        for (int t : truck_weights) wait.add(t);
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i=0;i<bridge_length;i++) q.add(0);

        
        int count = 0;
        int weightSum = 0;
        
        while (true) {
            answer++;
            
            int result = q.poll();
            if (result > 0) {
                count++;
                weightSum -= result;
            } 
            if (count == truck_weights.length) break;
            
            if (!wait.isEmpty() && weightSum + wait.peek() <= weight) {
                int truck = wait.poll();
                weightSum += truck;
                q.add(truck);
            } else {
                q.add(0);
            }
        }
        
        return answer;
    }
}