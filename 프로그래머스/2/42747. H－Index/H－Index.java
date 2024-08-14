import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        
        int left = 0;
        int right = citations[citations.length - 1];
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (solve(citations, mid)){
                answer = Math.max(answer, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return answer;
    }
    static private boolean solve(int[] arr, int h) {
        int low = 0;
        int high = 0;
        
        for (int k : arr) {
            if (k >= h) high++;
            else low++;
        }
        if (high >= h && low < h) return true;
        
        return false;
    }
}