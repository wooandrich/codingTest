#include<bits/stdc++.h>
using namespace std;

//

//

int n, ret,dl, la;
priority_queue<int, vector<int>, greater<int>> pq;
vector<pair<int,int>> v;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;

    for (int i=0;i<n;i++) {
        cin >> dl >> la;

        v.push_back({dl, la});
    }

    sort(v.begin(), v.end());

    for (int i=0;i<n;i++) {
        pq.push(v[i].second);

        if (pq.size() > v[i].first) {
            pq.pop();
        }
    }

    while (pq.size()) {
        ret += pq.top(); pq.pop();
    }

    cout << ret << '\n';







    return 0;
}
