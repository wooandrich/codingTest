import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 1;
        
        
        // 정렬
        Arrays.sort(targets, (o1,o2)->{
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else{
                return o1[0] - o2[0];
            }
        });
        
        int INF = Integer.MAX_VALUE;
        int start = -INF;
        int end = INF;
        
        
        for (int[] row : targets){
            int a = row[0];
            int b = row[1];
            
            if (a >= end){
                answer++;
                start = a;
                end = b;
            }else{
                start = Math.max(start, a);
                end = Math.min(end, b);
            }
        }
            
        return answer;
    }
}