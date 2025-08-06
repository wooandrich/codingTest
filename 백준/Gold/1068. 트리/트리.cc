#include <bits/stdc++.h>
using namespace std;

int n, target,parent,root;
const int MAX = 51;
vector<int> v[MAX];

int dfs(int node) {
    if (node == target) return 0;
    if (v[node].empty()) return 1;

    int ret = 0;

    for (int child : v[node]) {
        ret += dfs(child);
    }

    if (ret == 0) return 1;


    return ret;
}



int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);


    cin >> n;

    for (int i=0;i<n;i++) {
        cin >> parent;

        if (parent == -1) root = i;
        
        else v[parent].push_back(i);
    }

    cin >> target;


    cout << dfs(root) << '\n';

    

    
    return 0;
}