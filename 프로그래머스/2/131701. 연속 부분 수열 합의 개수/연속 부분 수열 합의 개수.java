import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> h = new HashSet<>();
        int step = 1;
        
        while(step != elements.length + 1){
            for(int i=0;i<elements.length;i++){
                int sum = 0;
                for(int j=i;j<i+step;j++){
                    sum += elements[j % elements.length];
                }
                h.add(sum);
            }
            step++;
        }
        
        return h.size();
    }
}