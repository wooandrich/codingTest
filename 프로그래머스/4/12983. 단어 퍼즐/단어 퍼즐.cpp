#include <bits/stdc++.h>
using namespace std;

int dp[20004], INF = 1e9;
vector<string> strs;
string t;

bool check(int n, string &s) {
    for (int i=0;i<s.size();i++) {
        if (n+i >= t.size()) return 0;
        if (t[n+i] != s[i]) return 0;
    }
    return 1;
}

int sol(int n) {
    if (n == t.size()) return 0;
    
    int &ret = dp[n];
    if (ret != -1) return ret;
    
    ret = INF;
    for (auto &s : strs) {
        if (check(n, s)) ret = min(ret, sol(n + s.size()));
    }
    return ++ret;
}


int solution(vector<string> _strs, string _t)
{
    memset(dp, -1, sizeof(dp));
    strs = _strs;
    t = _t;
    

    return sol(0) >= INF ? -1 : sol(0);
}