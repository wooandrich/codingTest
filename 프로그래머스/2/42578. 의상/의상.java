import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0;i<clothes.length;i++) {
            String a = clothes[i][1];
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        
        for (String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        
        return answer - 1;
    }
}