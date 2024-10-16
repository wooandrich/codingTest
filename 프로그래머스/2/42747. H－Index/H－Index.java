import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for (int i=0;i<citations[citations.length - 1];i++) {
            int low = 0;
            int high = 0;
            int h = i;
            
            for (int j=0;j<citations.length;j++) {
                if (citations[j] >= h) high++;
                
            }
            low = citations.length - high;
            if (high >= h && low <= h) {
                answer = Math.max(answer, h);
            }
        }
        
        
        return answer;
    }
}