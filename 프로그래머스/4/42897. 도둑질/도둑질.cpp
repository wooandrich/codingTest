#include <bits/stdc++.h>

using namespace std;

int ret = 0;
int dp[1000004];


int solution(vector<int> money) {
    dp[0] = money[0];
    dp[1] = money[0];
    
    for (int i=2; i<money.size() - 1;i++) {
        dp[i] = max(dp[i-2] + money[i], dp[i-1]);
    }
    
    ret = max(ret, dp[money.size() - 2]);
    
    dp[0] = 0;
    dp[1] = money[1];
    
    for (int i=2;i<money.size();i++) {
        dp[i] = max(dp[i-2] + money[i], dp[i-1]);
    }
    
    ret = max(ret, dp[money.size() - 1]);
    
    return ret;
}