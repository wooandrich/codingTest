#include<bits/stdc++.h>
using namespace std;


int n, m, arr[100004], ret = 1e9, l, r, mid;

bool check(int target) {
    int result = target;
    int cnt = 1;
    for (int i=0;i<n;i++) {
        if (result < arr[i]) {
            result = target;
            cnt++;
        }
        result -= arr[i];
    }

    return cnt <= m;
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> n >> m;

    for (int i=0;i<n;i++) {
        cin >> arr[i];
        r += arr[i];
        l = max(l, arr[i]);
    }


    while (l <= r) {
        mid = (l + r) / 2;
        if (check(mid)) {
            ret = min(ret, mid);
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }

    cout << ret << '\n';










    return 0;
}
