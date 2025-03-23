import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Queue<Integer> q = new LinkedList<>();

        char[] arr = s.toCharArray();
        
        for (char c : arr) {
            if (c == '(') {
                q.add(1);
            } else {
                if (q.isEmpty()) return false;
                else q.poll();
            }
            
        }   

        return true ? q.isEmpty() : false;
    }
}