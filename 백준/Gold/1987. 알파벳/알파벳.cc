#include<bits/stdc++.h>
using namespace std;

const int MAX = 24;
int a[MAX][MAX];
int visited[MAX][MAX];
int r,c,ret;
int dy[] = {-1, 1, 0, 0};
int dx[] = {0, 0, -1, 1};
int check[26];
string s;

void dfs(int y, int x, int cnt) {

    ret = max(ret, cnt);

    for (int i=0;i<4;i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];
        int node = a[ny][nx] - 'A';

        if (ny < 0 || ny >= r || nx < 0 || nx >= c) continue;
        if (check[node]) continue;
        if (visited[ny][nx]) continue;

        visited[ny][nx] = 1;
        check[node] = 1;
        dfs(ny,nx,cnt + 1);
        visited[ny][nx] = 0;
        check[node] = 0;
    }

}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> r >> c;

    for (int i=0;i<r;i++) {
        cin >> s;

        for (int j=0;j<c;j++) {
            a[i][j] = s[j];
        }
    }

    visited[0][0] = 1;
    int start = a[0][0] - 'A';
    check[start] = 1;
    dfs(0, 0, 1);

    cout << ret << '\n';







    return 0;
}


