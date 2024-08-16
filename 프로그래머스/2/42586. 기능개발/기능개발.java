import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for (int a : progresses) {
            q.offer(a);
        }
        
        int idx = 0;
        while(!q.isEmpty()) {
            int cnt = 1;
            
            int now = q.poll();
            int day = (100 - now);
            if (day % speeds[idx] != 0) day = day / speeds[idx] + 1;
            else day = day / speeds[idx];

            for (int i=idx+1;i<speeds.length;i++){
                int temp = q.peek();

                if (temp + speeds[i] * day >= 100) {
                    q.poll();
                    cnt++;
                    idx++;
                }
                else{
                    break;
                }
                
            }
            
            ans.add(cnt);
            idx++;
        }
        
        
        
        return ans.stream().mapToInt(x -> x).toArray();
    }
}