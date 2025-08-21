#include<bits/stdc++.h>
using namespace std;

int n, ok, a,b;
int arr[] = {0,1,2,3,4,5,6,7,8,9};
int visited[10];
vector<int> v;
vector<char> s;
string ret_temp, ret_min = "9999999999", ret_max = "0";
char temp;

void backtracking(int idx) {
    if (idx == n + 1) {
        for (int i=0; i<n + 1;i++) {
            if (i == 0) {
                a = v[i];
                b = v[i];
                continue;
            }
            b = v[i];
            if (s[i] == '>') {
                if (a > b) {
                    ok = 1;
                } else {
                    ok = 0;
                    break;
                }
            } else {
                if (a < b) {
                    ok = 1;
                } else {
                    ok = 0;
                    break;
                }
            }
            a = v[i];
        }

        if (ok) {
            ret_temp = "";
            for (auto &i : v) {
                ret_temp += to_string(i);
            }
            ret_max = max(ret_temp, ret_max);
            ret_min = min(ret_temp, ret_min);
        }

        return;
    }

    for (int i=0;i<10;i++) {
        if (!visited[i]) {
            visited[i] = 1;
            v.push_back(arr[i]);

            backtracking(idx + 1);

            visited[i] = 0;
            v.pop_back();
        }
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;

    s.push_back('0');
    for (int i=0;i<n;i++) {
        cin >> temp;
        s.push_back(temp);
    }


    backtracking(0);

    cout << ret_max << '\n';
    cout << ret_min << '\n';

    return 0;
}


