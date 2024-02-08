import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] one = new int[]{1,2,3,4,5};
        int[] two = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5,5};
        
        int[] arr = new int[]{0,0,0};
        
        
        for(int i = 0;i<answers.length;i++){
            int a = one[i % one.length];
            int b = two[i % two.length];
            int c = three[i % three.length];
            
            int ans = answers[i];
            
            if(ans == a) arr[0]++;
            if(ans == b) arr[1]++;
            if(ans == c) arr[2]++;
        }
        
        
        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
        
        for(int i=0;i<3;i++){
            if(arr[i] == max) answer.add(i+1);
        }
        
        
        
        
        
        
        
        
        
        
        return answer;
    }
}