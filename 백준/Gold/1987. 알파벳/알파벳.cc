#include<bits/stdc++.h>
using namespace std;

const int MAX = 24;

int visited[MAX][MAX];
char a[MAX][MAX];
int n,m,ret;
vector<char> v;
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};

void dfs(int y, int x) {

    ret = max(ret, (int)v.size());


    for (int i=0;i<4;i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];

        if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
        if (visited[ny][nx]) continue;
        if (find(v.begin(), v.end(), a[ny][nx]) != v.end()) continue;

        visited[ny][nx] = visited[y][x] + 1;
        v.push_back(a[ny][nx]);
        dfs(ny, nx);
        visited[ny][nx] = 0;
        v.pop_back();
    }

}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> m;

    for (int i=0;i<n;i++) {
        string temp;
        cin >> temp;
        for (int j=0;j<m;j++) {
            a[i][j] = temp[j];
        }
    }
    visited[0][0] = 1;
    v.push_back(a[0][0]);

    dfs(0,0);

    cout << ret << '\n';

    return 0;
}


