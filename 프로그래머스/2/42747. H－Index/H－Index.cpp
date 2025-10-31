#include <bits/stdc++.h>

using namespace std;

int l, r, mid;

bool check(int c, vector<int> citations) {
    int ok = 0;
    int no = 0;
    
    for (int i : citations) {
        if (i >= c) ok++;
    }
    no = citations.size() - ok;
    if (ok >= c && no <= c) return true;
    return false;
}

int solution(vector<int> citations) {
    int answer = 0;
    
    sort(citations.begin(), citations.end());
    l = 0;
    r = citations[citations.size() - 1];
    
    while (l <= r) {
        mid = (l + r) / 2;
        
        if (check(mid, citations)) {
            answer = max(answer, mid);
            l = mid + 1;
        } else {
            r = mid - 1;
        }
    }
    
    
    return answer;
}