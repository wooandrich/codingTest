#include <bits/stdc++.h>

using namespace std;

int visited[204];

void dfs(vector<vector<int>> computer, int idx) {
    visited[idx] = 1;

    vector<int> c = computer[idx];

    for (int i=0;i<c.size();i++) {
        if (idx != i && c[i] == 1 && visited[i] == 0) {
            dfs(computer, i);
        }
    }
}

int solution(int n, vector<vector<int>> computers) {
    int answer = 0;

    for (int i=0;i<n;i++) {
        if (!visited[i]) {
            dfs(computers, i);
            answer++;
        }
    }

    return answer;
}
