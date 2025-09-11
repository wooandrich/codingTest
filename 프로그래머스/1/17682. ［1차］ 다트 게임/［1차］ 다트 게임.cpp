#include <bits/stdc++.h>

using namespace std;

vector<int> v;
string s;

int solution(string dartResult) {
    int answer = 0;

    for (char c : dartResult) {
        if (isdigit(c)) {
            s += c;
        } else {
            if (!s.empty()) {
                v.push_back(stoi(s));
                s = "";
            }

            if (c == 'S') continue;
            if (c == 'D') {
                v[v.size() - 1] = v[v.size() - 1] * v[v.size() - 1];
            }
            else if (c == 'T') {
                v[v.size() - 1] = v[v.size() - 1] * v[v.size() - 1] * v[v.size() - 1];
            }
            else if (c == '*') {
                v[v.size() - 1] *= 2;

                if (v.size() > 1) {
                    v[v.size() - 2] *= 2;
                }
            }
            else if (c == '#') {
                v[v.size() - 1] *= -1;
            }

        }
    }

    for (int result : v) answer += result;


    return answer;
}