#include <bits/stdc++.h>
using namespace std;

const int MAX  = 10001;
vector<int> ret;

int n,m,s,e,cnt,max_cnt;

vector<int> computer[MAX];
int visited[MAX];

int dfs(int a) {
    if (visited[a] == 1) return 0;

    visited[a] = 1;

    int r = 1;

    for (int node : computer[a]) {
        if (visited[node]) continue;
        r += dfs(node);
    }

    return r;
}



int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> m;


    for (int i=0;i<m;i++) {
        cin >> s >> e;

        computer[e].push_back(s);
    }

    for (int i=1;i<=n;i++) {
        fill(&visited[0], &visited[0] + MAX, 0);
        cnt = dfs(i);

        if ( cnt > max_cnt) {
            max_cnt = cnt;
            ret.clear();
            ret.push_back(i);

        } else if (cnt == max_cnt) {
            ret.push_back(i);
        }
    }



    sort(ret.begin(), ret.end());

    for (auto i : ret) cout << i << " ";
    cout << '\n';

}