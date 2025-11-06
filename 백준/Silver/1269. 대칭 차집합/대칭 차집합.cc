

//



//



#include<bits/stdc++.h>
using namespace std;

int t, n, m, ret, l, r, mid, check;
vector<int> a,b;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> n >> m;

    for (int i=0;i<n;i++) {
        cin >> t;
        a.push_back(t);
    }

    for (int i=0;i<m;i++) {
        cin >> t;
        b.push_back(t);
    }

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    for (int target : a) {
        l = 0;
        r = m - 1;
        check = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (target == b[mid]) {
                check = 1;
                break;
            }

            if (target > b[mid]) l = mid + 1;
            else r = mid - 1;
        }
        if (!check) ret++;
    }



    for (int target : b) {
        l = 0;
        r = n - 1;
        check = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (target == a[mid]) {
                check = 1;
                break;
            }

            if (target > a[mid]) l = mid + 1;
            else r = mid - 1;
        }
        if (!check) ret++;
    }



    cout << ret << '\n';










    return 0;
}
