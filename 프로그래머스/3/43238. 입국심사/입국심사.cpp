#include <bits/stdc++.h>

using namespace std;
typedef long long ll;

ll l, r, mid,INF = 1e18, ret = INF;

bool check(int n, vector<int> times, ll target) {
    ll cnt = 0;

    for (ll t : times) {
        cnt += target / t;
    }

    return cnt >= n;
}

ll solution(int n, vector<int> times) {

    l = 1;
    for (ll t : times) {
        r = max(r, t);
    }
    r *= n;

    while (l <= r) {
        mid = (l + r) / 2;

        if (check(n, times, mid)) {
            ret = min(ret, mid);
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }



    return ret;
}