#include <bits/stdc++.h>

using namespace std;

struct A {
    int y,x;
    char friends;
};

char a[32][32];
int visited[32][32];
int ret;
vector<A> v;

bool cleanSqard(int y, int x) {
    int check = 0;
    for (int i=0;i<y-1;i++) {
        for (int j=0;j<x-1;j++) {
            int ok = 1;
            int sy = i, sx = j, ey = i+1, ex = j+1;
            char target = a[sy][sx];
            if (target == '0') continue;
            for (int ny = sy; ny <= ey;ny++) {
                for (int nx = sx; nx <= ex; nx++) {
                    if (target != a[ny][nx]) {
                        ok=0;
                        break;
                    }
                    if (!ok) break;
                }
            }
            if (ok) {
                check = 1;
                for (int ny = sy; ny <= ey;ny++) {
                    for (int nx = sx; nx <= ex; nx++) {
                        visited[ny][nx] = 1;
                    }
                }
            }
        }
    }

    for (int i=0;i<y;i++) {
        for (int j=0;j<x;j++) {
            if (visited[i][j]) {
                a[i][j] = '0';
                ret++;
            }
        }
    }

    if (check) return true;
    return false;
}

void falling(int y,int x) {
    for (int j=0;j<x;j++) {
        int ok = 1;
        for (int i=y-1;i>=0;i--) {
            if (a[i][j] == '0') ok = 0;
            if (ok == 0 && a[i][j] != '0') {
                v.push_back({i,j,a[i][j]});
            }
        }
    }

    for (A node : v) {
        int ny = node.y;
        int nx = node.x;
        char name = node.friends;
        a[ny][nx] = '0';

        while (ny + 1 < y && a[ny+1][nx] == '0') {
            ny++;
        }
        a[ny][nx] = name;
    }
    v.clear();
}

int solution(int m, int n, vector<string> board) {

    for (int i=0;i<m;i++) {
        string temp = board[i];
        for (int j=0;j<n;j++) {
            a[i][j] = temp[j];
        }
    }

    while (cleanSqard(m,n)) {
        falling(m,n);
        memset(visited, 0, sizeof(visited));
    }


    return ret;
}