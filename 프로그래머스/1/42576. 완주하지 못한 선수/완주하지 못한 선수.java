import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String p : participant) {
            if (hm.containsKey(p)) {
                hm.put(p, hm.get(p) + 1);
            }else{
                hm.put(p, 1);
            }
        }
        
        for (String c : completion) {
            hm.put(c, hm.get(c) - 1);
            if (hm.get(c) == 0) hm.remove(c);
        }
        
        for (String key : hm.keySet()) {
            answer = key;
        }
        
        
        
        return answer;
    }
}