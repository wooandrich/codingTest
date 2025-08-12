#include <bits/stdc++.h>
using namespace std;

const int MAX = 51;
int n,m;
int ret = 1e9;

int a[MAX][MAX];

vector<pair<int,int>> h;
vector<pair<int,int>> c;
vector<pair<int,int>> candi;

void solve(int start) {
    if (candi.size() == m) {
        int distance = 0;
        for (pair<int, int> i : h) {
            int minDistance = 1e9;
            for (pair<int,int> j : candi) {
                minDistance = min(minDistance , abs(i.first - j.first) + abs(i.second - j.second));
            }
            distance += minDistance;
        }
        ret = min(ret, distance);
        return;
    }

    for (int i=start; i < c.size(); i++) {
        candi.push_back(c[i]);
        solve(i + 1);
        candi.pop_back();
    }
} 

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> m;

    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++) {
            cin >> a[i][j];
            if (a[i][j] == 1) h.push_back({i,j});
            if (a[i][j] == 2) c.push_back({i,j});
        }
    }


    solve(0);

    cout << ret << '\n';



    


}