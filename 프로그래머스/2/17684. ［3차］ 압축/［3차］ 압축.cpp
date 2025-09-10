#include <bits/stdc++.h>

using namespace std;

map<string,int> m;
string w,c;
int idx = 1;

vector<int> solution(string msg) {
    vector<int> answer;

    for (char i='A';i<='Z';i++) {
        m[string(1, i)] = idx++;
    }

    for (int i=0;i<msg.size();i++) {
        w = "";
        int j = i;

        while (j < msg.size() && m.count(msg.substr(i, j - i + 1))) j++;


        w = msg.substr(i, j - i);
        answer.push_back(m[w]);

        if (j < msg.size()) {
            c = msg.substr(i, j - i + 1);
            m[c] = idx++;
        }

        i = j-1;

    }

    return answer;
}