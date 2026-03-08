import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> front = new HashMap<>();
        Map<Integer, Integer> back = new HashMap<>();
        
        for (int num : topping) {
            back.merge(num, 1, Integer::sum);
        }
        
        for (int num : topping) {
            back.put(num, back.get(num) - 1);
            if (back.get(num) == 0) back.remove(num);
            front.merge(num, 1, Integer::sum);
            
            if (front.size() == back.size()) answer++;
        }
        
        return answer;
    }
}