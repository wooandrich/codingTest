#include<bits/stdc++.h>
using namespace std;

const int INF = 987654321;
const int MAX = 24;
int a[MAX][MAX];
int n, ret = INF;

int go(vector<int> start, vector<int> link) {
    pair<int,int> ret;

    for (int i=0; i < n / 2; i++) {
        for (int j=0; j < n / 2; j++) {
            if (i == j) continue;
            ret.first += a[start[i]][start[j]];
            ret.second += a[link[i]][link[j]];
        }
    }
    return abs(ret.first - ret.second);
}


int main(){
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> n;

    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++) {
            cin >> a[i][j];
        }
    }

    for (int i=0;i < (1 << n); i++) {
        if (__builtin_popcount(i) != n / 2) continue;

        vector<int> start, link;

        for (int j=0;j<n;j++) {
            if (i & (1 << j)) start.push_back(j);
            else link.push_back(j);
        }

        ret = min(go(start, link), ret);
    }

    cout << ret << '\n';












    return 0;
}
