#include <bits/stdc++.h>
using namespace std;

int n,m;
int c_time, cnt;

const int MAX = 101;

int a[MAX][MAX];
int visited[MAX][MAX];

vector<pair<int, int>> v;

int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};

void dfs(int y, int x) {
    visited[y][x] = 1;

    for (int i=0;i<4;i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];

        if (ny >= 0 && ny < n && nx >= 0 && nx < m) {
            if (visited[ny][nx] == 0) {
                if (a[ny][nx] == 0) {
                    dfs(ny,nx);
                } else {
                    visited[ny][nx] = 1;
                    v.push_back({ny,nx});
                }
            }
        }
    }
    return;
}


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);


    cin >> n >> m;

    for (int i =0; i<n;i++) {
        for (int j=0;j<m;j++){
            cin >> a[i][j];
        }
    }

    while (true) {
        v.clear();
        fill(&visited[0][0], &visited[0][0] + 101 * 101, 0);

        dfs(0,0);
        

        
        
        if (v.empty()) break;

        cnt = v.size();
        c_time++;

        for (pair<int,int> p : v) {
            a[p.first][p.second] = 0;
        }

    }

    cout << c_time  << '\n';
    cout << cnt << '\n';

    
    







    

    
    

    




    
    
    

    
    return 0;
}