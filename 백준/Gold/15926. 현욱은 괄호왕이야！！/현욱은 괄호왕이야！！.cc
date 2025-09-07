#include <bits/stdc++.h>
using namespace std;

int n,ret,cnt;
string s;
int a[200004];
stack<int> st;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> s;

    for (int i=0;i<n;i++) {
        if (s[i] == '(') st.push(i);
        else if(st.size()) {
            a[i] = a[st.top()] = 1;
            st.pop();
        }
    }

    for (int i=0;i<n;i++) {
        if (a[i]) {
            cnt++;
            ret = max(ret, cnt);
        } else {
            cnt = 0;
        }
    }

    cout << ret << '\n';







    

    return 0;
}