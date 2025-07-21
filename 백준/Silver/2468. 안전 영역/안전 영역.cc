#include <bits/stdc++.h>
using namespace std;


const int MAX = 104;
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};
int graph[MAX][MAX];
int visited[MAX][MAX];



int n, ans;
int a = MAX;
int b = 0;

void dfs(int x, int y, int h) {
    visited[x][y] = 1;

    for (int i=0;i<4;i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
            if (graph[nx][ny] > h && visited[nx][ny] == 0) {
                dfs(nx,ny,h);
            }
        }
    }
    return;
}





int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    
    cin >> n;

    for (int i=0;i<n;i++) {
        for ( int j=0;j<n;j++) {
            int temp;
            cin >> temp;

            graph[i][j] = temp;
            a = min(a, temp);
            b = max(b, temp);
        }
    }

    for (int i=0; i <= b; i++) {
        fill(&visited[0][0], &visited[0][0] + 104 * 104, 0);
        int cnt = 0;
        for (int x=0;x<n;x++){
            for (int y=0;y<n;y++) {
                if (graph[x][y] > i && visited[x][y] == 0) {
                    dfs(x,y,i);
                    cnt++;
                }
            }
        }
        ans = max(ans, cnt);
    }

    cout << ans << '\n';







    

    
    

    




    
    
    

    
    return 0;
}