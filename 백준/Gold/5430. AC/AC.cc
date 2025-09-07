#include <bits/stdc++.h>
using namespace std;

int t,n,turn;
string p,s;


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> t;

    while(t--) {
        deque<int> dq;
        cin >> p;
        cin >> n;
        cin >> s;

        if (n > 0) {
            string temp = "";
            for (int i=1;i<s.length() - 1;i++) {
                if (s[i] == ',') {
                    dq.push_back(stoi(temp));
                    temp = "";
                }else {
                    temp += s[i];
                }
            }
            if (!temp.empty()) dq.push_back(stoi(temp));
        }

        int ok = 1;
        turn = 0;
        for (char order : p) {
            if (order == 'R') {
                turn ^= 1;
            }else {
                if (dq.size()) {
                    if (turn) dq.pop_back();
                    else dq.pop_front();
                }else {
                    ok = 0;
                    break;
                }
            }
            
        }
        if (ok) {
            string ret = "[";
            if (turn) reverse(dq.begin(), dq.end());
            for (int i = 0; i < dq.size(); i++) {
                ret += to_string(dq[i]);
                if (i < dq.size() - 1) ret += ",";
            }
            ret += "]";
            cout << ret << '\n';
        } else {
            cout << "error" << '\n';
        }
    }







    

    return 0;
}