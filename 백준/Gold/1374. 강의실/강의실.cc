#include<bits/stdc++.h>
using namespace std;

const int INF = 1e9;
int n,num,from,to,ret;
vector<pair<int,int>> v;
priority_queue<int, vector<int>, greater<int>> pq;


int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> n;

    for (int i=0;i<n;i++) {
        cin >> num >> from >> to;
        v.push_back({from, to});
    }

    sort(v.begin(), v.end());

    for (int i=0;i<n;i++) {
        int start_time = v[i].first;
        int end_time = v[i].second;

        while (pq.size() && pq.top() <= start_time) {
            pq.pop();
        }

        pq.push(end_time);

        ret = max(ret, (int) pq.size());
    }



    cout << ret << '\n';









    return 0;
}
