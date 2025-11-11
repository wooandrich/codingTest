

//



//



#include<bits/stdc++.h>
struct INFO;
using namespace std;
typedef long long ll;

int t, n, m, num;
vector<int> ret;
unordered_set<int> s;


int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> t;

    while (t--) {
        cin >> n;
        ret.clear();
        s.clear();

        for (int i=0;i<n;i++) {
            cin >> num;
            s.insert(num);
        }

        cin >> m;

        for (int i=0;i<m;i++) {
            cin >> num;
            if (s.find(num) != s.end()) {
                ret.push_back(1);
            } else {
                ret.push_back(0);
            }
        }

        for (int i : ret) cout << i << '\n';
    }
















    return 0;
}
