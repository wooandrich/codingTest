#include<bits/stdc++.h>
using namespace std;

//


//

int n,from,to,ret,room;
vector<pair<int,int>> v;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);


    cin >> n;
    for (int i=0;i<n;i++) {
        cin >> from >> to;

        v.push_back({to,from});
    }

    sort(v.begin(), v.end());

    room = v[0].first;
    ret++;

    for (int i=1;i<n;i++) {
        if (v[i].second >= room) {
            room = v[i].first;
            ret++;
        }
    }

    cout << ret << '\n';



    return 0;
}
