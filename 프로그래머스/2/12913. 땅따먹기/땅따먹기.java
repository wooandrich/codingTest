import java.util.*;

class Solution {
    int solution(int[][] land) {
        int answer = 0;

        int n = land.length;
        int m = land[0].length;
        
        int[][] dp = new int[n][m];
        
        for (int i=0;i<m;i++){
            dp[0][i] = land[0][i];
        }

        
        for (int i=1;i<n;i++) {
            for (int j=0;j<m;j++){
               for (int k=0;k<m;k++) {
                   if (j == k) continue;
                   dp[i][j] = Math.max(dp[i][j], land[i][j] + dp[i-1][k]);
               }
            }
        }
        
        for (int i=0;i<m;i++) {
            answer = Math.max(answer, dp[n-1][i]);
        }

        return answer;
    }
}