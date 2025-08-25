#include<bits/stdc++.h>
using namespace std;

const int MAX = 8;
int n,m,k,ret;
char a[MAX][MAX];
int visited[MAX][MAX];
int dy[] = {-1, 1, 0, 0};
int dx[] = {0, 0, -1, 1};

void dfs(int y, int x) {
    if (y == 0 && x == m-1) {
        if (visited[y][x] == k) {
            ret++;
        }
        return;
    }

    for (int i=0;i<4;i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];

        if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
        if (visited[ny][nx]) continue;
        if (a[ny][nx] == 'T') continue;

        visited[ny][nx] = visited[y][x] + 1;
        dfs(ny, nx);
        visited[ny][nx] = 0;
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);


    cin >> n >> m >> k;

    for (int i=0;i<n;i++) {
        string temp;
        cin >> temp;
        for (int j=0;j<m;j++) {
            a[i][j] = temp[j];
        }
    }
    visited[n-1][0] = 1;
    dfs(n - 1, 0);

    cout << ret << '\n';







    return 0;
}


