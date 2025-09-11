#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
//


//
ll a[100004], cnt[100001];
ll n,ret,s,e;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;

    for (int i=0;i<n;i++) {
        cin >> a[i];
    }

    while (e < n) {
        if (!cnt[a[e]]) {
            cnt[a[e]]++;
            e++;
        } else {
            ret += (e-s);
            cnt[a[s]]--;
            s++;
        }
    }

    ll last_result = (e - s) * (e - s + 1) / 2;
    ret += last_result;

    cout << ret << '\n';

















    return 0;
}
