#include<bits/stdc++.h>
using namespace std;

//

//

int n,ret,a,b,now_time;
vector<pair<int,int>> v;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);


    cin >> n;
    for (int i=0;i<n;i++) {
        cin >> a >> b;

        v.push_back({a,b});
    }

    sort(v.begin(), v.end());

    for (int i=0;i<n;i++) {
        if (v[i].first > now_time) {
            now_time = v[i].first + v[i].second;
            ret = now_time;
        } else {
            now_time += v[i].second;
            ret += v[i].second;
        }
    }

    cout << ret << '\n';








    return 0;
}
