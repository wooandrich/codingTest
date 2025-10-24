#include <bits/stdc++.h>
using namespace std;

int dp[20004], INF = 1e9;

int solution(vector<string> strs, string t)
{
    int answer = INF;
    fill(dp, dp + 20004, INF);
    
    dp[0] = 0;
    
    for (int i=1;i<=t.size();i++) {
        for (string &s : strs) {
            int l = s.size();
            if (i >= l && t.compare(i-l, l, s) == 0) {
                dp[i] = min(dp[i], dp[i-l] + 1);
            }
        }
        
    }
    

    

    return dp[t.size()] == INF ? -1 : dp[t.size()];
}