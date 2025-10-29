#include <bits/stdc++.h>

using namespace std;

map<string, int> m;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";

    for (string p : participant) {
        m[p]++;
    }

    for (string c : completion) {
        m[c]--;
    }

    for (string p : participant) {
        if (m[p]) {
            answer = p;
            break;
        }
    }

    return answer;
}