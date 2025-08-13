#include <bits/stdc++.h>
using namespace std;

int n,l,r,ret;

const int MAX = 51;

int a[MAX][MAX];
int visited[MAX][MAX];
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};

vector<vector<pair<int,int>>> v;

bool check() {
    v.clear();
    fill(&visited[0][0], &visited[0][0] + MAX * MAX, 0);

    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++) {
            if (visited[i][j] == 0) {
                queue<pair<int,int>> q;
                vector<pair<int,int>> friends;
                q.push({i,j});
                visited[i][j] = 1;

                while(!q.empty()) {
                    pair<int,int> p = q.front();
                    friends.push_back(p);
                    q.pop();
                    int y = p.first;
                    int x = p.second;
                    int people = a[y][x];

                    for (int k=0;k<4;k++) {
                        int ny = y + dy[k];
                        int nx = x + dx[k];

                        if (ny >= 0 && ny < n && nx >= 0 && nx < n) {
                            if (visited[ny][nx] == 0 && abs(a[ny][nx] - people) >= l && abs(a[ny][nx] - people) <= r) {
                                visited[ny][nx] = 1;
                                q.push({ny, nx});
                            }
                        }
                    }
                }
                if (friends.size() > 1) v.push_back(friends);
            }
        }
    }
    

    if (v.empty()) return false;

    return true;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> l >> r;

    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++) {
            cin >> a[i][j];
        }
    }

    while (check())
    {
        /* code */
        for (vector<pair<int,int>> i : v) {
            int sum_people = 0;
            int cnt = 0;

            for (pair<int,int> j : i) {
                sum_people += a[j.first][j.second];
                cnt++;
            }

            int new_people = sum_people / cnt;

            for (pair<int,int> j : i) {
                a[j.first][j.second] = new_people;
            }
            
        }


        ret++;
    }

    cout << ret << '\n';
    




    


}