#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
//


//
int n, ret;
vector<int> prime;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;

    vector<int> v(n+1, 1);

    for (int i=2;i*i<=n;i++) {
        if (v[i]) {
            for (int k=i*i;k<=n;k+=i) {
                v[k] = 0;
            }
        }
    }

    for (int i=2;i<=n;i++) {
        if (v[i]) {
            prime.push_back(i);
            if (i == n) ret++;
        }
    }

    if (prime.size() > 1) {

        int s = 0;
        int e = 1;
        int sum = prime[s] + prime[e];
        while (s < e) {
            if (sum == n) {
                ret++;
                sum += prime[++e];
            }
            else if (sum > n) {
                sum -= prime[s++];
            }
            else {
                sum += prime[++e];
            }

        }
    }

    cout << ret << '\n';














    return 0;
}
