import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int num : nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            }else{
                hm.put(num, 1);
            }
        }
        
        if (hm.size() >= n / 2) {
            answer = n / 2;
        } else {
            answer = hm.size();
        }
        
        
        
        return answer;
    }
}