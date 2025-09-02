#include<bits/stdc++.h>
using namespace std;

int n,ret;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);


    cin >> n;

    while (n > 0) {
        ret += (n & 1);
        n >>= 1;
    }


    cout << ret << '\n';








    return 0;
}


