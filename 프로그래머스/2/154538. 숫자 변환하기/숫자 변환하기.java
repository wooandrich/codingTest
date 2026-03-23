import java.util.*;

class Solution {
    static int[] dp;
    static int x;
    static int y;
    static int n;
    static int INF = 1000001;
    
    public int solution(int x, int y, int n) {
        int answer = 0;
        this.x = x;
        this.y = y;
        this.n = n;
        
        dp = new int[y + 1];
        
        Arrays.fill(dp, -1);
        
        answer = solve(y);
        
        return answer == INF ? -1 : answer;
    }
    
    static int solve(int nowVal) {
        if (nowVal == x) return 0;
        
        if (nowVal < x) return INF;
        
        if (dp[nowVal] != -1) return dp[nowVal];

        int min = INF;
        
        if (nowVal % 3 == 0) {
            min = Math.min(min, solve(nowVal / 3) + 1);
        }
        
        if (nowVal % 2 == 0) {
            min = Math.min(min, solve(nowVal / 2) + 1);
        }
        
        min = Math.min(min, solve(nowVal - n) + 1);
        
        dp[nowVal] = min;
        
        
        return dp[nowVal];
    }
}