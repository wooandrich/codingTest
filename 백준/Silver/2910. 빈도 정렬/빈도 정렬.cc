#include <bits/stdc++.h>
using namespace std;




int n,c;
vector<int> v;
map<int, int> cnt;
map<int, int> idx;

bool compare(int a, int b) {
    if (cnt[a] != cnt[b]) {
        return cnt[a] > cnt[b];
    } else {
        return idx[a] < idx[b];
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> c;

    for (int i=0;i<n;i++) {
        int temp;
        cin >> temp;
        v.push_back(temp);
        cnt[temp]++;
        
        if (idx.find(temp) == idx.end()) idx[temp] = i;
    }

    sort(v.begin(), v.end(), compare);

    for(int ret : v) cout << ret << " ";
    cout << '\n';

    

    
    







    

    
    

    




    
    
    

    
    return 0;
}