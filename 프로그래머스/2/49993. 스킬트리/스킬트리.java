import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for (char c : skill.toCharArray()) set.add(c - 'A');
        
        for (String tree : skill_trees) {
            Queue<Integer> q = new LinkedList<>();
            
            for (char c : skill.toCharArray()) q.add(c - 'A');
            
            boolean isOk = true;
            for (char alpha : tree.toCharArray()) {
                int num = (int) (alpha - 'A');
                
                if (set.contains(num)) {
                    if (q.peek() == num) {
                        q.poll();
                    } else {
                        isOk = false;
                        break;
                    }
                }
            }
            
            if (isOk) answer++;
        }
        
        
        return answer;
    }
}