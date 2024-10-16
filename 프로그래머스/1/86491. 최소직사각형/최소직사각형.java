class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int x = 0;
        int y = 0;
        
        for (int[] s : sizes) {
            int a = s[0];
            int b = s[1];
            
            a = Math.max(s[0], s[1]);
            b = Math.min(s[0], s[1]);
            
            x = Math.max(x,a);
            y = Math.max(y,b);
        }
        
        answer = x * y;
        
        return answer;
    }
}