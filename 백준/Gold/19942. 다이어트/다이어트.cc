#include <bits/stdc++.h>
using namespace std;

const int MAX = 16;
int n,ret = INT_MAX;
vector<int> vt;
int a[MAX][5];
int mp, mf, ms, mv;


void go(int idx) {
    int result = 0;
    int p = 0, f = 0, s = 0, v = 0;
    vector<int> temp;

    for (int i=0;i<n;i++) {
        if (idx & (1 << i)) {
            p += a[i][0];
            f += a[i][1];
            s += a[i][2];
            v += a[i][3];
            result += a[i][4];
            temp.push_back(i+1);
        }
    }
    if (ret > result || (ret == result && temp < vt)) {
        if (p >= mp && f >= mf && s >= ms && v >= mv) {
            ret = result;
            vt = temp;
        }
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;
    cin >> mp >> mf >> ms >> mv;

    for (int i=0;i<n;i++) {
        for (int j=0;j<5;j++) {
            cin >> a[i][j];
        }
    }

    for (int i=0;i < (1 << n); i++) {
        go(i);
    }

    sort(vt.begin(), vt.end());
     
    if (ret == INT_MAX) {
        cout << -1 << '\n';
    } else {
        cout << ret << '\n';

        for (auto &i : vt) cout << i << " ";
        cout << '\n';
    }






    

    return 0;
}