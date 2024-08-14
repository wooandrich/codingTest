import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        List<Integer> ans = new ArrayList();
        
        for (long i = left+1;i<=right+1;i++){
            long x = i / n + 1;
            long y = i % n;
            
            if (y == 0) ans.add(n);
            else {
                int val = (int) Math.max(x,y);
                ans.add(val);
            }
        }
        
        
        
        return ans.stream().mapToInt(x -> x).toArray();
    }
}