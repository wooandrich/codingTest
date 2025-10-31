#include <bits/stdc++.h>

using namespace std;

int ret, visited[10];

void backtracking(int k, vector<vector<int>> dungeons,  int cnt) {
    ret = max(ret, cnt);
    
    for (int i=0;i<dungeons.size();i++) {
        if (!visited[i] && k >= dungeons[i][0]) {
            visited[i] = 1;
            backtracking(k - dungeons[i][1], dungeons, cnt + 1);
            visited[i] = 0;
        }
    }
    
}


int solution(int k, vector<vector<int>> dungeons) {
    
    backtracking(k, dungeons, 0);
    
    return ret;
}