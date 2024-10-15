import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> first = new HashMap<>();
        Set<Integer> second = new HashSet<>();
        
        for (int i=0;i<topping.length;i++) {
            if (first.containsKey(topping[i])) {
                first.put(topping[i], first.get(topping[i]) + 1);
            } else {
                first.put(topping[i], 1);
            }
        }
        
        for (int t : topping) {
            first.put(t, first.get(t) - 1);
            second.add(t);
            if (first.get(t) == 0) {
                first.remove(t);
            }
            if (first.size() == second.size())  answer++;
            
        }
        
        
        
        
        return answer;
    }
}