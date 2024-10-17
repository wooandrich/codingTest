import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] cnt = new int[3];
        
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,1,2,3,2,4,2,5};
        int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int one = 0;
        int two = 0;
        int three = 0;
        
        for (int i=0;i<answers.length;i++) {
            int answer = answers[i];
            if (a[i % a.length] == answer) one++;
            if (b[i % b.length] == answer) two++;
            if (c[i % c.length] == answer) three++;
            
        }
        
        int max_val = Math.max(one, Math.max(two, three));
        
        List<Integer> answer = new ArrayList<>();
        
        if (max_val == one) answer.add(1);
        if (max_val == two) answer.add(2);
        if (max_val == three) answer.add(3);
        
        
        
        
        
        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}