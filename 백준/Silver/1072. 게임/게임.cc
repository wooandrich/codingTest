

//



//



#include<bits/stdc++.h>
struct INFO;
using namespace std;
typedef long long ll;

ll  l, r, mid, z, ret = 1e9, x, y;

bool check(ll val) {
    ll new_z =  (y + val) * 100 / (x + val);


    return z != new_z;
}


int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> x >> y;

    z = y * 100 / x;

    if (x == y) cout << -1 << '\n';
    else if (z == 99) cout << -1 << '\n';
    else {


        l = 1;
        r = 1e9;

        while (l <= r) {
            mid = (l + r) / 2;

            if (check(mid)) {
                ret = min(ret, mid);
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }

        cout << ret << '\n';
    }
















    return 0;
}
