#include <bits/stdc++.h>

using namespace std;

bool cmp(pair<int,int> &a, pair<int,int> &b) {
    if (a.second == b.second) return a.first < b.first;
    return a.second > b.second;
}

int solution(int k, vector<int> tangerine) {
    int answer = 0;
    int cnt = 0;
    
    map<int,int> m;
    
    for (auto &i : tangerine) {
        m[i]++;
    }
    
    vector<pair<int,int>> v(m.begin(), m.end());
    sort(v.begin(), v.end(), cmp);
    
    for (int i=0;i<v.size();i++) {
        answer++;
        
        cnt += v[i].second;
        if (cnt >= k) break;
    }
    
    
    return answer;
}