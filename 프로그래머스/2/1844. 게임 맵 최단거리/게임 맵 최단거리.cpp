#include<bits/stdc++.h>
using namespace std;

queue<pair<int,int>> q;
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};

int visited[104][104];
int y,x,nx,ny, n, m;

int solution(vector<vector<int> > maps)
{
    int answer = 0;

    n = maps.size();
    m = maps[0].size();

    q.push({0,0});
    visited[0][0] = 1;


    while (q.size()) {
        tie(y,x) =  q.front(); q.pop();

        for (int i=0;i<4;i++) {
            ny = y + dy[i];
            nx = x + dx[i];

            if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
            if (maps[ny][nx] == 0 || visited[ny][nx] != 0) continue;
            visited[ny][nx] = visited[y][x] + 1;
            q.push({ny,nx});
        }
    }


    return visited[n-1][m-1] == 0 ? -1 : visited[n-1][m-1];
}