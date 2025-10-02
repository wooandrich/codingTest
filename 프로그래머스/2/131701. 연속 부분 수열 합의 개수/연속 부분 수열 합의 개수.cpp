#include <bits/stdc++.h>

using namespace std;

map<int,int> m;

void recur(int cnt, int idx, vector<int> elements) {
    int result = 0;
    
    for (int i = 0; i<cnt;i++) {
        result += elements[(idx + i) % elements.size()];
    }
    
    if (m[result] == 0) m[result]++;
}

int solution(vector<int> elements) {
    int answer = 0;
    
    for (int i=1;i<=elements.size();i++) {
        for (int j=0;j<elements.size();j++) {
            recur(i,j, elements);
        }
    }
    
    return m.size();
}