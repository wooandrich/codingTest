import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        
        s = s.substring(2, s.length() - 2);
        String[] arr = s.split("\\},\\{");
        Arrays.sort(arr, (a, b) -> a.length() - b.length());
        for (String a : arr) {
            String[] nums = a.split(",");
            
            for (String n : nums) {
                if (seen.add(n)) {
                    answer.add(Integer.parseInt(n));
                }
            }
        }
        
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}