#include<bits/stdc++.h>
using namespace std;

const int MAX = 14;


int n, ret = INT_MAX;
int a[MAX][MAX];
int visited[MAX][MAX];
vector<pair<int,int>> v;
vector<pair<int,int>> remove_v;

int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};

void go() {
    int ok = 1;
    for (pair<int,int> p : v) {
        int y = p.first;
        int x = p.second;

        for (int i=0;i<4;i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || ny >= n || nx < 0 || nx >= n) {
                ok = 0;
                break;
            }
            if (visited[ny][nx]) {
                ok = 0;
                break;
            }
            visited[ny][nx] = 1;
            remove_v.push_back({ny,nx});
        }
        if (!ok) break;
    }
    if (ok) {
        int temp = 0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (visited[i][j]) temp += a[i][j];
            }
        }
        ret = min(ret, temp);
    }

    for (pair<int,int> p : remove_v) {
        visited[p.first][p.second] = 0;
    }
    remove_v.clear();
}

void dfs(int cnt) {
     if (cnt == 3) {
         go();

         return;
     }
    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++) {
            if (visited[i][j]) continue;
            v.push_back({i, j});
            visited[i][j] = 1;
            dfs(cnt + 1);
            v.pop_back();
            visited[i][j] = 0;
        }
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;

    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++) {
            cin >> a[i][j];
        }
    }

    dfs(0);


    cout << ret << '\n';







    return 0;
}


