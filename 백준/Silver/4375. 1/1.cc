#include <bits/stdc++.h>
using namespace std;

int n,k, ans;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    
    while (cin >> n) {
        k = 1;
        ans = 1;
        
        while(true) {
            if (k % n == 0) break;

            k = k * 10 + 1;
            ans++;
            k %= n;
        }


        cout << ans << '\n';
    }

    
    

    




    
    
    

    
    return 0;
}