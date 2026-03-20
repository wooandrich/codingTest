import java.util.*;

class Solution {
    
    static int[][] dp;
    static int n;
    static int m;
    static int[][] arr;
    
    int solution(int[][] land) {
        int answer = 0;
        
        this.arr = land;
        n = land.length;
        m = land[0].length;
        
        dp = new int[n][m];
        
        for (int i=0;i<n;i++) {
            Arrays.fill(dp[i], -1);
        }
        
        for (int j=0;j<m;j++) {
            answer = Math.max(answer, dfs(n-1, j));
        }
        

        return answer;
    }
    
    static int dfs(int row, int col) {
        if (row == 0) return arr[row][col];
        
        if (dp[row][col] != -1) return dp[row][col];
        
        int result = 0;
        
        for (int j=0;j<m;j++) {
            if (col == j) continue;
            
            
            result = Math.max(result, dfs(row-1, j));
        }
        
        dp[row][col] = arr[row][col] + result;
        
        return dp[row][col];
    }
}