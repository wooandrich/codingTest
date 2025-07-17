#include <bits/stdc++.h>
using namespace std;


const int MAX = 54;
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};
int graph[MAX][MAX];
int visited[MAX][MAX];



int n,m,k,t;


void dfs(int x,int y) {
    visited[x][y] = 1;

    for (int i=0;i<4;i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
            if (graph[nx][ny] == 1 && visited[nx][ny] == 0) {
                dfs(nx,ny);
            }
        }
    }
}


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> t;

    for (int i=0;i<t;i++) {
        int ans = 0;

        

        cin >> m >> n >> k;

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                graph[a][b] = 0;
                visited[a][b] = 0;
            }
        }

        for (int j=0;j<k;j++) {
            int a,b;
            cin >> a >> b;
            graph[a][b] = 1;
        }

        for (int r=0;r<m;r++){
            for (int c=0;c<n;c++){
                if (graph[r][c] == 1 && visited[r][c] == 0) {
                    dfs(r,c);
                    ans++;
                }
            }
        }

        cout << ans << '\n';
    }



    

    
    

    




    
    
    

    
    return 0;
}
