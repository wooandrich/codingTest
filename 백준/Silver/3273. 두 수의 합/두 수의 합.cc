#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
//


//
int n, target, ret, s, e;
vector<int> v;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;

    for (int i=0;i<n;i++) {
        int temp;
        cin >> temp;
        v.push_back(temp);
    }

    cin >> target;

    sort(v.begin(), v.end());

    if (n > 1) {
        e = v.size() - 1;
        while (s < e) {
            int result = v[s] + v[e];
            if (result == target) {
                ret++;
                e--;
            }
            else if (result < target) {
                s++;
            } else {
                e--;
            }
        }
    }


    cout << ret << '\n';



















    return 0;
}
