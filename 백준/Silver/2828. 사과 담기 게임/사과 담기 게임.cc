#include <bits/stdc++.h>
using namespace std;



const int MAX = 65;
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};
char graph[MAX][MAX];
int visited[MAX][MAX];

int n,m,ans,j,l,r;


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> m;

    cin >> j;

    l = 1;

    for (int i=0;i<j;i++) {
        int temp;
        cin >> temp;

        r = l + m - 1;

        if (temp >= l && temp <= r) continue;

        if (temp > l) {
            ans += temp - r;
            l += temp - r;
        } else {
            ans += l - temp;
            l = temp;
        }
    }

    

    cout << ans << '\n';

    

    
    







    

    
    

    




    
    
    

    
    return 0;
}