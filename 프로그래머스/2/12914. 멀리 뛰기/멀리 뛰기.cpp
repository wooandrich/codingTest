#include <bits/stdc++.h>
using namespace std;

long long answer;




long long solution(int n) {
    
    if (n == 1) return 1;
    
    vector<int> v(n + 1, 0);
    
    v[1] = 1;
    v[2] = 2;
    
    for (int i=3;i<=n;i++) {
        v[i] = (v[i-2] + v[i-1]) % 1234567;
    }

    return v[n];
}