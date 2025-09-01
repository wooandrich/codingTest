#include<bits/stdc++.h>
using namespace std;

const int MAX = 24;
const int INF = 987654321;
int r,c,ret=0;
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};

int a[MAX][MAX];

void go(int y, int x, int num, int cnt) {
    ret = max(ret, cnt);

    for (int i=0;i<4;i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];

        if (ny < 0 || ny >= r || nx < 0 || nx >= c) continue;
        int _next = 1 << (a[ny][nx] - 'A');
        if ((num & _next) == 0) go(ny, nx, num | _next, cnt + 1);
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >>  r >> c;

    for (int i=0;i<r;i++) {
        string s;
        cin >> s;
        for (int j=0;j<c;j++) {
            a[i][j] = s[j];
        }
    }

    go(0,0, 1 << (int)(a[0][0] - 'A'), 1);

    cout << ret << '\n';











    return 0;
}


