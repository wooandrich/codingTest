#include<bits/stdc++.h>
using namespace std;

int s;
string order;
int m,n;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> m;

    while (m--) {
        cin >> order;

        if (order == "add") {
            cin >> n;
            s |= (1 << (n-1));
        }
        else if (order == "check") {
            cin >> n;
            if (s & ( 1 << (n-1))) {
                cout << 1 << '\n';
            }else {
                cout << 0 << '\n';
            }
        }
        else if (order == "remove") {
            cin >> n;
            s &= ~(1<<(n-1));
        }
        else if (order == "toggle") {
            cin >> n;
            if (s & ( 1 << (n-1))) {
                s &= ~(1<<(n-1));
            }else {
                s |= (1 << (n-1));
            }
        }
        else if (order == "all") {
            s = (1 << 20) - 1;
        }
        else {
            s = 0;
        }
    }










    return 0;
}


