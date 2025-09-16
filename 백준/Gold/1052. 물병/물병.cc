#include<bits/stdc++.h>
using namespace std;

int n,k,ret;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> n >> k;

    while (__builtin_popcount(n) > k) {
        n++;
        ret++;
    }

    cout << ret << '\n';




    return 0;
}
