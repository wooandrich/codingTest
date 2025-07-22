#include <bits/stdc++.h>
using namespace std;


const int MAX = 101;
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};
int graph[MAX][MAX];
int visited[MAX][MAX];

int ans,n,m,k;
vector<int> v;



int dfs(int x, int y) {
    visited[x][y] = 1;
    int area = 1;

    for (int i=0;i<4;i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
            if (graph[nx][ny] == 0 && visited[nx][ny] == 0) {
                area += dfs(nx, ny);
            
            }
        }
    }

    return area;
    
}





int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> m >> k;

    for (int i=0;i<k;i++) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        cin >> a >> b >> c >> d;

        for (int p=b;p<d;p++) {
            for (int q=a;q<c;q++) {
                graph[p][q] = 1;
            }
        }
    }

    for (int i=0;i<n;i++) {
        for (int j=0;j<m;j++) {
            if (graph[i][j] == 0 && visited[i][j] == 0) {
                ans++;
                v.push_back(dfs(i,j));
            }
        }
    }

    cout << ans << '\n';

    sort(v.begin(), v.end());

    for (int c : v) {
        cout << c << " ";
    }
    cout << '\n';
    
    







    

    
    

    




    
    
    

    
    return 0;
}