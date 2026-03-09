import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b) -> map.get(b) - map.get(a) );
        
        for (int i=0;i<priorities.length;i++) {
            map.put(i, priorities[i]);
            q.add(i);
            pq.add(i);
        }
        
        while(!q.isEmpty()) {
            int popNum = q.poll();
            int target = pq.peek();
            
            if (map.get(popNum) == map.get(target)) {
                pq.poll();
                answer++;
                
                if (popNum == location) return answer;
            }
            else {
                q.add(popNum);
            }
            
            
        }
        
        
        
        return answer;
    }
}