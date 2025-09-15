#include<bits/stdc++.h>
using namespace std;

const int MAX = 54;
int r,c,t,ret;
pair<int,int> clean1;
pair<int,int> clean2;
int a[MAX][MAX];
int temp_a[MAX][MAX];
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};

void fly(int y, int x) {
    int cnt = 0;
    vector<pair<int,int>> temp;

    for (int i=0;i<4;i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];

        if (ny < 0 || ny >= r || nx < 0 || nx >= c) continue;
        if (a[ny][nx] == -1) continue;
        cnt++;
        temp.push_back({ny, nx});
    }
    int plus = a[y][x] / 5;

    if (cnt) {
        temp_a[y][x] -= cnt * plus;

        for (pair<int,int> p : temp) {
            temp_a[p.first][p.second] += plus;
        }
    }
}


int main(){
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> r >> c >> t;

    int one = 0;

    for (int i=0;i<r;i++) {
        for (int j=0;j<c;j++) {
            cin >> a[i][j];
            if (!one && a[i][j] == -1) {
                clean1.first = i;
                clean1.second = j;
                one = 1;
            }
            if (one && a[i][j] == -1) {
                clean2.first = i;
                clean2.second = j;
            }
        }
    }

    while (t--) {
        fill(&temp_a[0][0], &temp_a[0][0] + MAX * MAX, 0);

        // 미세먼지 확산
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                if (a[i][j] > 0) fly(i,j);
            }
        }

        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                a[i][j] += temp_a[i][j];
            }
        }

        // 공기청정기 작동
        // 위쪽부터
        for (int i=clean1.first - 1; i>=1; i--) {
            a[i][clean1.second] = a[i-1][clean1.second];
        }
        for (int j=clean1.second; j<c-1;j++) {
            a[0][j] = a[0][j+1];
        }
        for (int i=0;i<clean1.first;i++) {
            a[i][c-1] = a[i+1][c-1];
        }
        for (int j=c-1;j>clean1.second + 1;j--) {
            a[clean1.first][j] = a[clean1.first][j-1];
        }
        a[clean1.first][clean1.second + 1] = 0;

        // 아래공기청정기
        for (int i=clean2.first + 1; i < r-1;i++) {
            a[i][clean2.second] = a[i+1][clean2.second];
        }

        for (int j=clean2.second;j<c-1;j++) {
            a[r-1][j] = a[r-1][j+1];
        }

        for (int i=r-1;i>clean2.first;i--) {
            a[i][c-1] = a[i-1][c-1];
        }

        for (int j=c-1;j>clean2.second+1;j--) {
            a[clean2.first][j] = a[clean2.first][j-1];
        }

        a[clean2.first][clean2.second + 1] = 0;

    }


    for (int i=0;i<r;i++) {
        for (int j=0;j<c;j++) {
            if (a[i][j] > 0) ret += a[i][j];
        }
    }

    cout << ret << '\n';




    return 0;
}
