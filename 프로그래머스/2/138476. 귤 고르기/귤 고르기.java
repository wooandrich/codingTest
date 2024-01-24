import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int[] num = new int[10000001];
        
        for(int i =0;i<tangerine.length;i++){
            int index = tangerine[i];
            num[index]++;
        }
        
        Arrays.sort(num);
        
        for(int i=num.length-1;i>=0;i--){
            k -= num[i];
            answer++;
            if(k <=0) break;
        }
        
        
        
        
        
        return answer;
    }
}