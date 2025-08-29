#include<bits/stdc++.h>
using namespace std;

string s;
int ok = 1;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> s;

    int idx = 0;
    while (idx < s.length()) {
        if (s[idx] == 'p') {
            if (s.substr(idx, 2) != "pi" ) {
                ok = 0;
                break;
            }
            idx += 2;
        }
        else if (s[idx] == 'k') {
            if (s.substr(idx, 2) != "ka" ) {
                ok = 0;
                break;
            }
            idx += 2;
        }
        else if (s[idx] == 'c') {
            if (s.substr(idx, 3) != "chu" ) {
                ok = 0;
                break;
            }
            idx += 3;
        }
        else {
            ok = 0;
            break;
        }
    }

    if (ok) cout << "YES" << '\n';
    else cout << "NO" << '\n';







    return 0;
}


