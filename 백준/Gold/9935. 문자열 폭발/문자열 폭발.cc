#include<bits/stdc++.h>
using namespace std;

//

//

string s, target, ret;
stack<char> st;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> s >> target;


    for (char c: s) {
        st.push(c);

        if (st.size() >= target.size() && st.top() == target[target.size() - 1]) {
            string temp = "";
            for (int i = 0; i < target.size(); i++) {
                temp += st.top();
                st.pop();
            }
            reverse(temp.begin(), temp.end());
            if (temp != target) {
                for (char t: temp) st.push(t);
            }
        }
    }

    if (st.size() == 0) cout << "FRULA" << '\n';
    else {
        while (st.size()) {
            ret += st.top();
            st.pop();
        }
        reverse(ret.begin(), ret.end());
        cout << ret << '\n';
    }


    return 0;
}
