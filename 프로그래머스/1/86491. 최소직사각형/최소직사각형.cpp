#include <bits/stdc++.h>

using namespace std;

int solution(vector<vector<int>> sizes) {
    int answer = 0;
    int a = 0;
    int b = 0;
    
    for (vector<int> size : sizes) {
        sort(size.begin(), size.end());
        a = max(a, size[0]);
        b = max(b, size[1]);
    }
    
    answer = a * b;
    
    
    
    return answer;
}