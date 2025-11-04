

//



//



#include<bits/stdc++.h>
using namespace std;

int t, n, m, ret;
vector<int> a,b;

bool check(int a_num, int b_num) {
    return a_num > b_num;
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> t;

    while (t--) {
        ret = 0;
        cin >> n >> m;
        a.clear();
        b.clear();

        int num;
        for (int i=0;i<n;i++) {
            cin >> num;
            a.push_back(num);
        }

        for (int i=0;i<m;i++) {
            cin >> num;
            b.push_back(num);
        }
        sort(a.begin(), a.end());
        sort(b.begin(), b.end());

        for (int a_num : a) {
            int left = 0;
            int right = m - 1;
            int mid = (left + right) / 2;
            while (left <= right) {
                mid = (left + right) / 2;
                if (check(a_num, b[mid])) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            ret += left;
        }

        cout << ret << '\n';
    }










    return 0;
}
