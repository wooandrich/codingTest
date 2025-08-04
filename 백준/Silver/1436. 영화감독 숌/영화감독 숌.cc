#include <bits/stdc++.h>
using namespace std;

int ret, ans,n;


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;

    while (ret != n) {
        ans++;

        string a = to_string(ans);
        if (a.find("666") != string::npos) ret++; 
    }

    cout << ans << '\n';

    

    
    







    

    
    

    




    
    
    

    
    return 0;
}