#include<bits/stdc++.h>
using namespace std;


int n,l,from,to, cnt, pos;
vector<pair<int,int>> v;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> n >> l;

    for (int i=0;i<n;i++) {
        cin >> from >> to; to--;
        v.push_back({from, to});
    }

    sort(v.begin(), v.end());

    int start = v[0].first - 1;
    int end = v[0].second;

    while (start < end) {
        start += l;
        pos = start;
        cnt++;
    }


    for (int i=1;i<v.size();i++) {
        int start = v[i].first;
        int end = v[i].second;

        int from_n = pos - l + 1;
        int to_n = pos;

        if (start >= from_n  && end <= to_n) continue;
        start--;
        start = max(pos, start);
        while (start < end) {
            start += l;
            pos = start;
            cnt++;
        }
    }

    cout << cnt << '\n';






    return 0;
}
