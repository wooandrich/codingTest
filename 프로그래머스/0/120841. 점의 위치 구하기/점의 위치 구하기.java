class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        int answer = 0;
        
        if (x > 0 && y > 0) answer = 1;
        else if (x < 0 && y > 0) answer = 2;
        else if (x < 0 && y < 0) answer = 3;
        else answer = 4;
        
        
        return answer;
    }
}