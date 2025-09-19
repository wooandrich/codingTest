#include<bits/stdc++.h>
using namespace std;

int n, cnt, min_ret = 1e9, max_ret = -1e9;
int a[14], cal[4];

void solve(int idx, int result) {
    if (idx == 1) {
        result = a[1];
    }
    if (idx == n) {
        min_ret = min(min_ret, result);
        max_ret = max(max_ret, result);

        return;
    }

    for (int i=0;i<4;i++) {
        if (cal[i] > 0) {
            cal[i]--;
            if (i == 0) solve(idx + 1, result + a[idx +1]);
            else if (i == 1) solve(idx + 1, result - a[idx + 1]);
            else if (i == 2) solve(idx + 1, result * a[idx + 1]);
            else solve(idx + 1, result / a[idx + 1]);
            cal[i]++;
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> n;
    for (int i=1;i<=n;i++) {
        cin >> a[i];
    }

    for (int i=0;i<4;i++) {
        cin >> cnt;
        cal[i] = cnt;
    }

    solve(1, 0);


    cout << max_ret << '\n';
    cout << min_ret << '\n';





    return 0;
}
