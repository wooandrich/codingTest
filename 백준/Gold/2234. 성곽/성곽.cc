#include<bits/stdc++.h>
using namespace std;

const int MAX = 54;
int n,m,ret1, ret2, ret3;
int dy[] = {0, -1, 0, 1};
int dx[] = {-1, 0, 1, 0}; // 서북동남;

int a[MAX][MAX];
int visited[MAX][MAX];
int reSize[2504];

int dfs1(int y, int x, int ret) {
    int cnt = 1;
    visited[y][x] = ret;
    for (int i=0; i<4; i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];

        if (a[y][x] & (1 << (i))) continue;
        if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
        if (visited[ny][nx]) continue;

        cnt += dfs1(ny, nx, ret);
    }

    return cnt;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> m >> n;

    for (int i=0;i<n;i++) {
        for (int j=0;j<m;j++) {
            cin >> a[i][j];
        }
    }

    for (int i=0;i<n;i++) {
        for (int j=0;j<m;j++) {
            if (!visited[i][j]) {
                ret1++;
                reSize[ret1] = dfs1(i,j,ret1);
                ret2 = max(reSize[ret1], ret2);
            }
        }
    }

    for (int i=0;i<n;i++) {
        for (int j=0;j<m;j++) {
            if (i + 1 < n) {
                int p = visited[i][j];
                int q = visited[i+1][j];
                if (p != q) {
                    ret3 = max(ret3, reSize[p] + reSize[q]);
                }
            }

            if (j + 1 < m) {
                int p = visited[i][j];
                int q = visited[i][j+1];
                if (p != q) {
                    ret3 = max(ret3, reSize[p] + reSize[q]);
                }
            }
        }
    }

    cout << ret1 << '\n';
    cout << ret2 << '\n';
    cout << ret3 << '\n';









    return 0;
}


