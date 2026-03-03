import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] clothe : clothes) {
            map.merge(clothe[1], 1, Integer::sum);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            answer *= entry.getValue() + 1;
        }
        
        
        return answer - 1;
    }
}