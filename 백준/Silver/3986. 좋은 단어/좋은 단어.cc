#include <bits/stdc++.h>
using namespace std;

int n;
int ans;
int main() {
    ios::sync_with_stdio(false);

    cin.tie(nullptr);
   cin >> n;

   for(int i=0;i<n;i++){
    stack<char> s;
    string a;
    cin >> a;
    for (char c : a){
        if (s.size() > 0) {
            if (s.top() == c) s.pop();
            else s.push(c);
        }else{
            s.push(c);
        }
    }
    if (s.size() == 0) ans++;
   }

   cout << ans << '\n';

    
    

    




    
    
    

    
    return 0;
}