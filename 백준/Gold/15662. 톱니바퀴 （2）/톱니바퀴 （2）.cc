#include<bits/stdc++.h>
using namespace std;

string s[1004];
int t, k, target, dir, ret;

int findL(int idx) {
    for (int i = idx; i >= 1; i--) {
        if (s[i][6] == s[i-1][2]) return i;
    }

    return 0;
}

int findR(int idx) {
    for (int i=idx; i < t-1;i++) {
        if (s[i][2] == s[i+1][6]) return i;
    }

    return t-1;
}

void rot(int pos, int dir) {
    if (dir) {
        rotate(s[pos].rbegin(), s[pos].rbegin() + 1, s[pos].rend());
    } else {
        rotate(s[pos].begin(), s[pos].begin() + 1, s[pos].end());
    }
}


int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> t;

    for (int i=0;i<t;i++) {
        string temp;
        cin >> temp;
        s[i] = temp;
    }

    cin >> k;
    for (int i=0;i<k;i++) {
        cin >> target >> dir; target--;

        dir = (dir == -1 ? 0 : 1);

        int l = findL(target);
        int r = findR(target);

        int cnt = 0;
        for (int pos = target; pos >=l;pos--) {
            rot(pos, cnt % 2 == 0 ? dir : !dir);
            cnt++;
        }
        cnt = 1;
        for (int pos = target + 1; pos <= r; pos++) {
            rot(pos, cnt % 2 == 0 ? dir : !dir);
            cnt++;
        }

    }


    for (int i=0;i<t;i++) {
        if (s[i][0] == '1') ret++;
    }

    cout << ret << '\n';





    return 0;
}
