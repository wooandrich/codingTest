#include <bits/stdc++.h>
using namespace std;

int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};

const int MAX = 1001;

int miro[MAX][MAX];
int visited[MAX][MAX];
int n,m;
queue<pair<int , int>> q;


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> m;

    for (int i=0;i<n;i++){
        string row;
        cin >> row;
        for(int j=0;j<m;j++){
            miro[i][j] = row[j] - '0';
        }
    }

    q.push({0,0});
    visited[0][0] = 1;

    while (!q.empty()) {
        pair<int, int> current = q.front();
        q.pop();
        int y = current.first;
        int x = current.second;

        for (int i=0;i<4;i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny >= 0 && ny < n && nx >= 0 && nx < m) {
                if (miro[ny][nx] == 1 && visited[ny][nx] == 0) {
                    q.push({ny, nx});
                    visited[ny][nx] = visited[y][x] + 1;
                }
            }
        }

    }

    cout << visited[n - 1][m - 1] << '\n';



    

    
    

    




    
    
    

    
    return 0;
}