import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        if (n > s) {
            return new int[] {-1};
        } else {
            int rest = s % n;
            
            for (int i=0;i<n-rest;i++) {
                answer[i] = s / n;
            }
            
            for (int i=n - rest;i<n;i++) {
                answer[i] = s / n + 1;
            }
        }
        
        
        return answer;
    }
}