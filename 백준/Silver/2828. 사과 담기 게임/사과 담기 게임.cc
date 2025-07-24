#include <bits/stdc++.h>
using namespace std;



const int MAX = 65;
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};
char graph[MAX][MAX];
int visited[MAX][MAX];

int n,m,ans,j,l,r;


queue<int> q;


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> m;

    cin >> j;

    for (int i=0;i<j;i++) {
        int temp;
        cin >> temp;

        q.push(temp);
    }

    l =1;
    if (m > 1) r = l + m - 1;
    else r = l;

    while(q.size()) {
        int k = q.front();
        q.pop();

        int cnt = min(abs(k - l), abs(k - r));
        if (k >= l && k <= r) cnt = 0;
        ans += cnt;
        if (l > k) {
            l -= cnt;
            r -= cnt;
        } else {
            l += cnt;
            r += cnt;
        }
        
    }

    cout << ans << '\n';

    

    
    







    

    
    

    




    
    
    

    
    return 0;
}