import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        for (int[] c : commands) {
            int start = c[0] - 1;
            int end = c[1];
            int find = c[2] - 1;
            
            List<Integer> arr = new ArrayList<>();
            
            for (int i = start;i<end;i++) {
                arr.add(array[i]);
            }
            
            Collections.sort(arr);
            
            answer[cnt++] = arr.get(find);
        }
        
        
        return answer;
    }
}