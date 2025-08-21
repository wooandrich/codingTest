#include<bits/stdc++.h>
using namespace std;

const int MAX = 1504;
int a[MAX][MAX];
int visited[MAX][MAX];
int n, m, ret;
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> m;

    queue<pair<int,int>> wq;
    queue<pair<int,int>> sq;

    for (int i=0; i<n;i++) {
        string temp;
        cin >> temp;
        for (int j=0;j<m;j++) {
            a[i][j] = temp[j];

            if (a[i][j] == '.' || a[i][j] == 'L') wq.push({i,j});
            if (a[i][j] == 'L' && sq.empty()) {
                sq.push({i,j});
                visited[i][j] = 1;
            }
        }
    }

    while (1) {
        queue<pair<int,int>> new_sq;
        // 백조부터
        while (sq.size()) {
            int y,x;
            tie(y,x) = sq.front(); sq.pop();

            for (int i=0;i<4;i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
                if (visited[ny][nx]) continue;

                visited[ny][nx] = 1;

                if (a[ny][nx] == '.') {
                    sq.push({ny,nx});
                } else if (a[ny][nx] == 'X') {
                    new_sq.push({ny,nx});
                } else {
                    cout << ret << '\n';
                    return 0;
                }
            }
        }

        int wqSize = wq.size();

        for (int i=0;i<wqSize;i++) {
            int y,x;
            tie(y,x) = wq.front(); wq.pop();

            for (int k=0;k<4;k++) {
                int ny = y + dy[k];
                int nx = x + dx[k];

                if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;

                if (a[ny][nx] == 'X') {
                    wq.push({ny,nx});
                    a[ny][nx] = '.';
                }
            }
        }

        sq = new_sq;
        ret++;
    }






    return 0;
}


