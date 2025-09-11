#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
//


//

ll n,k,ret, w, p,c,cnt;
vector<pair<ll,ll>> v;
vector<ll> bags;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);


    cin >> n >> k;

    for (int i=0;i<n;i++) {
        cin >> w >> p;
        v.push_back({w, p});
    }

    sort(v.begin(), v.end());

    for (int i=0;i<k;i++) {
        cin >> c;
        bags.push_back(c);
    }
    sort(bags.begin(), bags.end());

    int j=0;
    priority_queue<ll> pq;
    for (int i=0;i<k;i++) {
        while (j < n && v[j].first <= bags[i]) pq.push(v[j++].second);

        if (pq.size()) {
            ret += pq.top(); pq.pop();
        }
    }

    cout << ret << '\n';







    return 0;
}
