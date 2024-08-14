import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0;i<want.length;i++){
            map.put(want[i], number[i]);
        }
        // discount 돌면서
        // 1. left = 0, right = 9로 설정하고, 
        // 2. 돌면서 map 안에 있으면 -1 하기
        // 3. right를 discount.length 까지 돌면서 map의 value가 모두 1보다 작으면 answer++
        // 초기 세팅
        int left = 0;
        int right = 9;
        for (int i = left;i<=right;i++){
                String target = discount[i];
                if (map.containsKey(target)){
                    map.put(target, map.get(target) - 1);
                } 
        }
        boolean flag = true;
        for(String s : want) {
            if (map.get(s) >= 1) {
                flag = false;
                break;
            }
        }
        if (flag) answer++;
    
        while (right < discount.length - 1) {
            
            String left_val = discount[left++];
            
            String right_val = discount[++right];
            
            
            if (map.containsKey(left_val)) map.put(left_val, map.get(left_val) + 1);
            if (map.containsKey(right_val)) map.put(right_val, map.get(right_val) - 1);
            
            flag = true;
            for(String s : want) {
                if (map.get(s) >= 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer++;
        }
    
        
        
        return answer;
    }
}